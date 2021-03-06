$(function() {
    var _pageNum = 1
    var _pageSize = 10
    var _url = '/search/picture'

    $.tbpage("#pictureList", function (pageNum, pageSize) {
        getPictureList(_url, pageNum, pageSize)
        _pageNum = pageNum
        _pageSize = pageSize
    });

    $("#search").off("click", ".btn").on("click", ".btn", function () {
        getPictureList(_url, _pageNum, _pageSize)
    })

    $("#search input").off("keypress").on("keypress", function (e) {
        if (e.which == 13) {
            getPictureList(_url, _pageNum, _pageSize)
        }
    })

    $("#searchType a").off("click").on("click", function () {
        var url = $(this).attr("url")
        getPictureList(url, 1, _pageSize)
    })

    function getPictureList(url, pageNum, pageSize) {
        var query = $("#search input").val()
        //url传参特殊字符(+、#、%、&)处理
        query = query.replace(/\+/g, '%2B')
        query = query.replace(/\#/g,"%23")
        query = query.replace(/\%/g,"%25")
        query = query.replace(/\&/g, '%26')
        var url = url + '?query=' + query + '&pageNum=' + pageNum + '&pageSize=' + pageSize
        window.location = url
    }
});