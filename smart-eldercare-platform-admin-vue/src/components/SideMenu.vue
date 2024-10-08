<template>
    <a-menu v-model:selectedKeys="state.selectedKeys" theme="dark" mode="inline" :open-keys="state.openKeys"
        :items="items" @openChange="onOpenChange" @click="handleMenuClick"></a-menu>
</template>

<script setup>
import { h, onMounted, reactive } from 'vue';
import { useRouter } from 'vue-router';
import {
    UserOutlined,
    AppstoreOutlined,
    SettingOutlined,
} from '@ant-design/icons-vue';

const router = useRouter();

function getItem(label, key, icon, children, route) {
    return {
        key,
        icon,
        children,
        label,
        route,
    };
}

const items = [
    getItem('用户管理', 'user', () => h(UserOutlined), [
        getItem('老人管理', 'elderly', null, null, '/user/elderly'),
        getItem('家属管理', 'family', null, null, '/user/family'),
        getItem('护工管理', 'caregiver-manager', null, null, '/user/caregiver-manager')
    ]),
    getItem('日常生活管理', 'life', () => h(UserOutlined), [
        getItem('用药提醒', 'medicine', null, null, '/medicine'),
        getItem('饮食建议与膳食', 'food', null, null, '/food'),
        getItem('运动建议与计划', 'sports', null, null, '/sports')
    ]),
    getItem('护理服务管理', 'caregiver', () => h(AppstoreOutlined), [
        getItem('护理需求发布', 'care', null, null, '/care'),
        getItem('护工匹配与预约', 'appointment', null, null, '/appointment'),
        getItem('服务评价系统', 'stars', null, null, '/stars'),
        getItem('护理记录管理', 'record', null, null, '/record'),
    ]),
    getItem('系统管理', 'system', () => h(SettingOutlined), [
        getItem('角色管理', 'role', null, null, '/role'),
        getItem('权限管理', 'permission', null, null, '/permission'),
        getItem('用户管理', 'user-manager', null, null, '/system/user'),
    ]),
];

const state = reactive({
    rootSubmenuKeys: ['user', 'life', 'caregiver', 'system'],
    openKeys: ['user'],
    selectedKeys: ['elderly'],
});

const onOpenChange = (openKeys) => {
    const latestOpenKey = openKeys.find(key => state.openKeys.indexOf(key) === -1);
    if (state.rootSubmenuKeys.indexOf(latestOpenKey) === -1) {
        state.openKeys = openKeys;
    } else {
        state.openKeys = latestOpenKey ? [latestOpenKey] : [];
    }
};

const handleMenuClick = ({ key }) => {
    const item = findMenuItem(items, key);
    if (item && item.route) {
        router.push(item.route);
    }
};

function findMenuItem(items, key) {
    for (const item of items) {
        if (item.key === key) {
            return item;
        }
        if (item.children) {
            const found = findMenuItem(item.children, key);
            if (found) {
                return found;
            }
        }
    }
    return null;
}

onMounted(() => {
    router.push("/user/elderly")
})
</script>