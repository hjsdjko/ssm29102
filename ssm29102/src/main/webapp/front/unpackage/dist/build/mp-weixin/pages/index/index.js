(global["webpackJsonp"]=global["webpackJsonp"]||[]).push([["pages/index/index"],{"22c9":function(n,t,e){"use strict";(function(n){e("254b");i(e("66fd"));var t=i(e("a1c2"));function i(n){return n&&n.__esModule?n:{default:n}}n(t.default)}).call(this,e("543d")["createPage"])},"2f34":function(n,t,e){},"546d":function(n,t,e){"use strict";var i=e("2f34"),r=e.n(i);r.a},7116:function(n,t,e){"use strict";e.r(t);var i=e("e5d4"),r=e.n(i);for(var a in i)"default"!==a&&function(n){e.d(t,n,(function(){return i[n]}))}(a);t["default"]=r.a},a1c2:function(n,t,e){"use strict";e.r(t);var i=e("aa28"),r=e("7116");for(var a in r)"default"!==a&&function(n){e.d(t,n,(function(){return r[n]}))}(a);e("546d");var o,u=e("f0c5"),c=Object(u["a"])(r["default"],i["b"],i["c"],!1,null,null,null,!1,i["a"],o);t["default"]=c.exports},aa28:function(n,t,e){"use strict";var i;e.d(t,"b",(function(){return r})),e.d(t,"c",(function(){return a})),e.d(t,"a",(function(){return i}));var r=function(){var n=this,t=n.$createElement,e=(n._self._c,n.__map(n.weizhilist,(function(t,e){var i=n.__get_orig(t),r=t.fengmian?t.fengmian.split(","):null;return{$orig:i,g0:r}}))),i=null,r=n.__map(n.bianjilist,(function(t,e){var i=n.__get_orig(t),r=t.fengmian?t.fengmian.split(","):null;return{$orig:i,g2:r}})),a=null;n.$mp.data=Object.assign({},{$root:{l0:e,l1:i,l2:r,l3:a}})},a=[]},e5d4:function(n,t,e){"use strict";(function(n){Object.defineProperty(t,"__esModule",{value:!0}),t.default=void 0;var i=r(e("a34a"));function r(n){return n&&n.__esModule?n:{default:n}}function a(n,t){var e;if("undefined"===typeof Symbol||null==n[Symbol.iterator]){if(Array.isArray(n)||(e=o(n))||t&&n&&"number"===typeof n.length){e&&(n=e);var i=0,r=function(){};return{s:r,n:function(){return i>=n.length?{done:!0}:{done:!1,value:n[i++]}},e:function(n){throw n},f:r}}throw new TypeError("Invalid attempt to iterate non-iterable instance.\nIn order to be iterable, non-array objects must have a [Symbol.iterator]() method.")}var a,u=!0,c=!1;return{s:function(){e=n[Symbol.iterator]()},n:function(){var n=e.next();return u=n.done,n},e:function(n){c=!0,a=n},f:function(){try{u||null==e.return||e.return()}finally{if(c)throw a}}}}function o(n,t){if(n){if("string"===typeof n)return u(n,t);var e=Object.prototype.toString.call(n).slice(8,-1);return"Object"===e&&n.constructor&&(e=n.constructor.name),"Map"===e||"Set"===e?Array.from(n):"Arguments"===e||/^(?:Ui|I)nt(?:8|16|32)(?:Clamped)?Array$/.test(e)?u(n,t):void 0}}function u(n,t){(null==t||t>n.length)&&(t=n.length);for(var e=0,i=new Array(t);e<t;e++)i[e]=n[e];return i}function c(n,t,e,i,r,a,o){try{var u=n[a](o),c=u.value}catch(l){return void e(l)}u.done?t(c):Promise.resolve(c).then(i,r)}function l(n){return function(){var t=this,e=arguments;return new Promise((function(i,r){var a=n.apply(t,e);function o(n){c(a,i,r,o,u,"next",n)}function u(n){c(a,i,r,o,u,"throw",n)}o(void 0)}))}}e("6996");var f=function(){Promise.all([e.e("common/vendor"),e.e("components/uni-ui/lib/uni-icons/uni-icons")]).then(function(){return resolve(e("d9ec"))}.bind(null,e)).catch(e.oe)},s={components:{uniIcons:f},data:function(){return{autoplaySwiper:!0,intervalSwiper:5e3,swiperList:[],weizhilist:[],bianjilist:[],news:[]}},onShow:function(){var n=this;return l(i.default.mark((function t(){var e,r,o,u,c;return i.default.wrap((function(t){while(1)switch(t.prev=t.next){case 0:return e=[],t.next=3,n.$api.page("config",{page:1,limit:5});case 3:r=t.sent,o=a(r.data.list);try{for(o.s();!(u=o.n()).done;)c=u.value,c.name.indexOf("picture")>=0&&c.value&&""!=c.value&&null!=c.value&&e.push({img:c.value})}catch(i){o.e(i)}finally{o.f()}return e&&(n.swiperList=e),t.next=9,n.$api.recommend("weizhi",1,6);case 9:return r=t.sent,n.weizhilist=r.data.list,t.next=13,n.$api.recommend("bianji",1,6);case 13:r=t.sent,n.bianjilist=r.data.list;case 15:case"end":return t.stop()}}),t)})))()},methods:{onSwiperTap:function(n){},onNewsDetailTap:function(n){this.$utils.jump("../news-detail/news-detail?id=".concat(n))},onDetailTap:function(n,t){this.$utils.jump("../".concat(n,"/detail?id=").concat(t))},onPageTap:function(t){n.navigateTo({url:"../".concat(t,"/list"),fail:function(){n.switchTab({url:"../".concat(t,"/list")})}})}}};t.default=s}).call(this,e("543d")["default"])}},[["22c9","common/runtime","common/vendor"]]]);