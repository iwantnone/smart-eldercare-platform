// App.vue
<template>
  <a-layout style="min-height: 100vh">
    <a-layout-sider>
      <router-link to="/">
        <div class="logo">
          怡康安心养老管理系统
        </div>
      </router-link>
      <side-menu />
    </a-layout-sider>
    <a-layout>
      <a-layout-header style=" background: #fff; padding: 0">
        <a-row justify="end" align="middle" style="height: 100%">
          <a-col style="padding-right: 24px;">
            <a-dropdown>
              <a class="ant-dropdown-link" @click.prevent>
                管理员 <down-outlined />
              </a>
              <template #overlay>
                <a-menu>
                  <a-menu-item key="0">
                    <user-outlined />
                    个人信息
                  </a-menu-item>
                  <a-menu-item key="1">
                    <logout-outlined />
                    退出登录
                  </a-menu-item>
                </a-menu>
              </template>
            </a-dropdown>
          </a-col>
        </a-row>
      </a-layout-header>
      <a-layout-content style="margin: 24px 16px 0">
        <div style="padding: 24px; background: #fff; min-height: 360px">
          <router-view></router-view>
        </div>
      </a-layout-content>
      <a-layout-footer style="text-align: center">
        养老项目管理系统 ©2024 Created by ppzhu
      </a-layout-footer>
    </a-layout>
  </a-layout>
</template>

<script setup>
import {
  UserOutlined,
  DownOutlined,
  LogoutOutlined
} from '@ant-design/icons-vue';
import SideMenu from '@/components/SideMenu.vue';



</script>

<style scoped>
.logo {
  height: 32px;
  margin: 16px;
  color: whitesmoke;
  font-weight: bold;
  display: flex;
  align-items: center;
  justify-content: center;
  font-size: larger;
}
</style>