const base = {
    get() {
        return {
            url : "http://localhost:8080/ssm29102/",
            name: "ssm29102",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssm29102/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "未知微信小程序"
        } 
    }
}
export default base
