 /**
 * v-hasPermi 操作权限处理
 * Copyright (c) 2019 ruoyi
 */

import store from '@/store'

export default {
  inserted(el, binding, vnode) {
    const { value } = binding
    const permissions = store.getters && store.getters.resources


    if (value && value instanceof Array && value.length > 0) {
      const permissionFlag = value

      const hasPermissions = permissions.some(permission => {
        // console.log(permission,permissionFlag);
        if(permissionFlag.includes(permission))
          return true;
        let index = permission.lastIndexOf("/**");
        if (index !== -1){
          return permissionFlag.some(p=>{
            if(permission.includes(p.slice(0,index))){
              // console.log(p.slice(0,index));
              return true;
            }
          });
        }

      })

      if (!hasPermissions) {
        el.parentNode && el.parentNode.removeChild(el)
      }
    } else {
      throw new Error(`请设置操作权限标签值`)
    }
  }
}
