(global["webpackJsonp"]=global["webpackJsonp"]||[]).push([["pages/discussbianji/add-or-update"],{"34fd":function(e,n,t){"use strict";t.r(n);var r=t("7702"),a=t.n(r);for(var u in r)"default"!==u&&function(e){t.d(n,e,(function(){return r[e]}))}(u);n["default"]=a.a},4629:function(e,n,t){"use strict";t.r(n);var r=t("ca8c"),a=t("34fd");for(var u in a)"default"!==u&&function(e){t.d(n,e,(function(){return a[e]}))}(u);t("4654");var i,c=t("f0c5"),o=Object(c["a"])(a["default"],r["b"],r["c"],!1,null,"05b3a489",null,!1,r["a"],i);n["default"]=o.exports},4654:function(e,n,t){"use strict";var r=t("8186"),a=t.n(r);a.a},7702:function(e,n,t){"use strict";(function(e){Object.defineProperty(n,"__esModule",{value:!0}),n.default=void 0;var r=a(t("a34a"));function a(e){return e&&e.__esModule?e:{default:e}}function u(e,n,t,r,a,u,i){try{var c=e[u](i),o=c.value}catch(s){return void t(s)}c.done?n(o):Promise.resolve(o).then(r,a)}function i(e){return function(){var n=this,t=arguments;return new Promise((function(r,a){var i=e.apply(n,t);function c(e){u(i,r,a,c,o,"next",e)}function o(e){u(i,r,a,c,o,"throw",e)}c(void 0)}))}}var c=function(){Promise.all([t.e("common/vendor"),t.e("components/w-picker/w-picker")]).then(function(){return resolve(t("30b4"))}.bind(null,t)).catch(t.oe)},o={data:function(){return{ruleForm:{refid:"",userid:"",nickname:"",content:"",reply:""},user:{},ro:{refid:!1,userid:!1,nickname:!1,content:!1,reply:!1}}},components:{wPicker:c},computed:{},onLoad:function(n){var t=this;return i(r.default.mark((function a(){var u,i,c,o;return r.default.wrap((function(a){while(1)switch(a.prev=a.next){case 0:return u=e.getStorageSync("nowTable"),a.next=3,t.$api.session(u);case 3:if(i=a.sent,t.user=i.data,t.ruleForm.userid=e.getStorageSync("userid"),n.refid&&(t.ruleForm.refid=n.refid,t.ruleForm.nickname=e.getStorageSync("nickname")),!n.id){a.next=13;break}return t.ruleForm.id=n.id,a.next=11,t.$api.info("discussbianji",t.ruleForm.id);case 11:i=a.sent,t.ruleForm=i.data;case 13:if(!n.cross){a.next=40;break}c=e.getStorageSync("crossObj"),a.t0=r.default.keys(c);case 16:if((a.t1=a.t0()).done){a.next=40;break}if(o=a.t1.value,"refid"!=o){a.next=22;break}return t.ruleForm.refid=c[o],t.ro.refid=!0,a.abrupt("continue",16);case 22:if("userid"!=o){a.next=26;break}return t.ruleForm.userid=c[o],t.ro.userid=!0,a.abrupt("continue",16);case 26:if("nickname"!=o){a.next=30;break}return t.ruleForm.nickname=c[o],t.ro.nickname=!0,a.abrupt("continue",16);case 30:if("content"!=o){a.next=34;break}return t.ruleForm.content=c[o],t.ro.content=!0,a.abrupt("continue",16);case 34:if("reply"!=o){a.next=38;break}return t.ruleForm.reply=c[o],t.ro.reply=!0,a.abrupt("continue",16);case 38:a.next=16;break;case 40:t.styleChange();case 41:case"end":return a.stop()}}),a)})))()},methods:{styleChange:function(){this.$nextTick((function(){}))},getUUID:function(){return(new Date).getTime()},onSubmitTap:function(){var n=this;return i(r.default.mark((function t(){return r.default.wrap((function(t){while(1)switch(t.prev=t.next){case 0:if(n.ruleForm.refid){t.next=3;break}return n.$utils.msg("关联表id不能为空"),t.abrupt("return");case 3:if(n.ruleForm.userid){t.next=6;break}return n.$utils.msg("用户id不能为空"),t.abrupt("return");case 6:if(n.ruleForm.content){t.next=9;break}return n.$utils.msg("评论内容不能为空"),t.abrupt("return");case 9:if(!n.ruleForm.id){t.next=14;break}return t.next=12,n.$api.update("discussbianji",n.ruleForm);case 12:t.next=16;break;case 14:return t.next=16,n.$api.add("discussbianji",n.ruleForm);case 16:e.setStorageSync("discussbianjiCleanType",!0),n.$utils.msgBack("提交成功");case 18:case"end":return t.stop()}}),t)})))()},optionsChange:function(e){this.index=e.target.value},bindDateChange:function(e){this.date=e.target.value},getDate:function(e){var n=new Date,t=n.getFullYear(),r=n.getMonth()+1,a=n.getDate();return"start"===e?t-=60:"end"===e&&(t+=2),r=r>9?r:"0"+r,a=a>9?a:"0"+a,"".concat(t,"-").concat(r,"-").concat(a)},toggleTab:function(e){this.$refs[e].show()}}};n.default=o}).call(this,t("543d")["default"])},8186:function(e,n,t){},ca8c:function(e,n,t){"use strict";var r;t.d(n,"b",(function(){return a})),t.d(n,"c",(function(){return u})),t.d(n,"a",(function(){return r}));var a=function(){var e=this,n=e.$createElement;e._self._c},u=[]},dce3:function(e,n,t){"use strict";(function(e){t("254b");r(t("66fd"));var n=r(t("4629"));function r(e){return e&&e.__esModule?e:{default:e}}e(n.default)}).call(this,t("543d")["createPage"])}},[["dce3","common/runtime","common/vendor"]]]);