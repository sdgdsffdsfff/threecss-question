function IndexMediator() {

    this.init = function (view) {
        $("#speakButton").on("click", this.onSpeakHandle);
        $("#listenButton").on("click", this.onListenHandle);
        $("#tongji").on("click", this.onTongjiHandle);
    }
    // 注销方法
    this.dispose = function () {

    }
    // 关心消息数组
    this.listNotificationInterests = [];
    // 关心的消息处理
    this.handleNotification = function (data) {

    }
    this.onSpeakHandle = function () {
        window.location.href = "speak.html";
    }
    this.onListenHandle = function () {
        window.location.href = "listen.html";
    }
    this.onTongjiHandle = function () {
        window.location.href = "count.html";
    }
}
$T.indexMediator = new IndexMediator();