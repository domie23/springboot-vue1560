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
    import news from '@/views/modules/news/list'
    import discusscheweixinxi from '@/views/modules/discusscheweixinxi/list'
    import cheweifenlei from '@/views/modules/cheweifenlei/list'
    import chuchangjiaofei from '@/views/modules/chuchangjiaofei/list'
    import storeup from '@/views/modules/storeup/list'
    import users from '@/views/modules/users/list'
    import tousujianyi from '@/views/modules/tousujianyi/list'
    import forum from '@/views/modules/forum/list'
    import cheweixinxi from '@/views/modules/cheweixinxi/list'
    import ruchangtingche from '@/views/modules/ruchangtingche/list'
    import yonghu from '@/views/modules/yonghu/list'
    import weiguichufa from '@/views/modules/weiguichufa/list'
    import chat from '@/views/modules/chat/list'
    import config from '@/views/modules/config/list'


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
	path: '/news',
        name: '系统公告',
        component: news
      }
          ,{
	path: '/discusscheweixinxi',
        name: '车位信息评论',
        component: discusscheweixinxi
      }
          ,{
	path: '/cheweifenlei',
        name: '车位分类',
        component: cheweifenlei
      }
          ,{
	path: '/chuchangjiaofei',
        name: '出场缴费',
        component: chuchangjiaofei
      }
          ,{
	path: '/storeup',
        name: '我的收藏管理',
        component: storeup
      }
          ,{
	path: '/users',
        name: '管理员',
        component: users
      }
          ,{
	path: '/tousujianyi',
        name: '投诉建议',
        component: tousujianyi
      }
          ,{
	path: '/forum',
        name: '论坛交流',
        component: forum
      }
          ,{
	path: '/cheweixinxi',
        name: '车位信息',
        component: cheweixinxi
      }
          ,{
	path: '/ruchangtingche',
        name: '入场停车',
        component: ruchangtingche
      }
          ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
          ,{
	path: '/weiguichufa',
        name: '违规处罚',
        component: weiguichufa
      }
          ,{
	path: '/chat',
        name: '在线交流',
        component: chat
      }
          ,{
	path: '/config',
        name: '轮播图管理',
        component: config
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
