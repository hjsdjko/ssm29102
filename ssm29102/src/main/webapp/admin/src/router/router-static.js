import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import forum from '@/views/modules/forum/list'
    import weizhi from '@/views/modules/weizhi/list'
    import bianji from '@/views/modules/bianji/list'
    import dingyuexinxi from '@/views/modules/dingyuexinxi/list'
    import yonghu from '@/views/modules/yonghu/list'
    import discussweizhi from '@/views/modules/discussweizhi/list'
    import discussbianji from '@/views/modules/discussbianji/list'
    import leixingxinxi from '@/views/modules/leixingxinxi/list'
    import storeup from '@/views/modules/storeup/list'
    import config from '@/views/modules/config/list'
    import xiaoxitixing from '@/views/modules/xiaoxitixing/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/forum',
        name: '交流论坛',
        component: forum
      }
      ,{
	path: '/weizhi',
        name: '未知',
        component: weizhi
      }
      ,{
	path: '/bianji',
        name: '编辑',
        component: bianji
      }
      ,{
	path: '/dingyuexinxi',
        name: '订阅信息',
        component: dingyuexinxi
      }
      ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
      ,{
	path: '/discussweizhi',
        name: '未知评论',
        component: discussweizhi
      }
      ,{
	path: '/discussbianji',
        name: '编辑评论',
        component: discussbianji
      }
      ,{
	path: '/leixingxinxi',
        name: '类型信息',
        component: leixingxinxi
      }
      ,{
	path: '/storeup',
        name: '我的收藏管理',
        component: storeup
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
      ,{
	path: '/xiaoxitixing',
        name: '消息提醒',
        component: xiaoxitixing
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
