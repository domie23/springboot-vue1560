const base = {
    get() {
                return {
            url : "http://localhost:8080/ssm2f7gd/",
            name: "ssm2f7gd",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssm2f7gd/front/index.html'
        };
            },
    getProjectName(){
        return {
            projectName: "停车场管理系统"
        } 
    }
}
export default base
