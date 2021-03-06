package com.dong.ebook.controller;

import com.dong.ebook.dto.*;
import com.dong.ebook.model.User;
import com.dong.ebook.security.AuthUserService;
import com.dong.ebook.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping
public class HomePageController {
    @Autowired
    UserService userService;

    @Autowired
    AuthUserService authUserService;

    @Autowired
    BookService bookService;

    @Autowired
    VideoService videoService;

    @Autowired
    MusicService musicService;

    @Autowired
    PictureService pictureService;

    @Autowired
    BlogService blogService;

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/pcHome")
    public String pcHome(Model model) {
        //用户
        User curUser = authUserService.getCurUser();
        //图书
        ResponseMainPageBookListDto responseMainPageBookListDto = bookService.getMainPageBookList();
        //视频
        ResponseMainPageVideoListDto responseMainPageVideoListDto = videoService.getMainPageVideoList();
        //音乐
        ResponseMainPageMusicListDto responseMainPageMusicListDto = musicService.getMainPageMusicList();
        //图片
        ResponseMainPagePictureListDto responseMainPagePictureListDto = pictureService.getMainPagePictureList();
        //博客
        ResponseBlogListDto mainPagePictureList = blogService.getMainPageBlogList();

        model.addAttribute("user", curUser);
        model.addAttribute("bigBooks", responseMainPageBookListDto.getBigBookDtos());
        model.addAttribute("smallBooks", responseMainPageBookListDto.getSmallBookDtos());
        model.addAttribute("videos", responseMainPageVideoListDto.getVideoDtos());
        model.addAttribute("firstPageMusic", responseMainPageMusicListDto.getFirstPageMusic());
        model.addAttribute("secondPageMusic", responseMainPageMusicListDto.getSecondPageMusic());
        model.addAttribute("thirdPageMusic", responseMainPageMusicListDto.getThirdPageMusic());
        model.addAttribute("popularMusic", responseMainPageMusicListDto.getPopularMusic());
        model.addAttribute("englishMusic", responseMainPageMusicListDto.getEnglishMusic());
        model.addAttribute("douyinMusic", responseMainPageMusicListDto.getDouyinMusic());
        model.addAttribute("bigPicture", responseMainPagePictureListDto.getBigPictureDtos());
        model.addAttribute("smallPicture", responseMainPagePictureListDto.getSmallPictureDtos());
        model.addAttribute("circlePicture", responseMainPagePictureListDto.getCirclePictureDtos());
        model.addAttribute("blogList", mainPagePictureList.getPageInfo().getList());
        return "pcHome";
    }

    @RequestMapping("/mobileHome")
    public String mobileHome(Model model) {
        //用户
        User curUser = authUserService.getCurUser();
        //图书
        ResponseMobileMainPageBookListDto responseMobileMainPageBookListDto= bookService.getMobileMainPageBookList();
        //视频
        ResponseMobileMainPageVideoListDto responseMobileMainPageVideoListDto = videoService.getMobileMainPageVideoList();
        //音乐
        ResponseMobileMainPageMusicListDto responseMobileMainPageMusicListDto = musicService.getMobileMainPageMusicList();
        //图片
        ResponseMobileMainPagePictureListDto responseMobileMainPagePictureListDto = pictureService.getMobileMainPagePictureList();
        //博客
        ResponseBlogListDto mainPagePictureList = blogService.getMainPageBlogList();

        model.addAttribute("user", curUser);
        model.addAttribute("books", responseMobileMainPageBookListDto.getBooks());
        model.addAttribute("videos", responseMobileMainPageVideoListDto.getVideos());
        model.addAttribute("musics", responseMobileMainPageMusicListDto.getMusics());
        model.addAttribute("pictures", responseMobileMainPagePictureListDto.getPictures());
        model.addAttribute("blogList", mainPagePictureList.getPageInfo().getList());
        return "mobileHome";
    }

    @GetMapping("/register")
    public String registerUser() {
        return "register";
    }

    @PostMapping("/register")
    @ResponseBody
    public ResponseUserDto registerUser(RequestUserDto RequestUserDto) {
        ResponseUserDto responseUserDto = userService.addUser(RequestUserDto);
        return responseUserDto;
    }

    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/search")
    public String search(){
        return "search/main";
    }

    @GetMapping("/pagesError403")
    public String pagesError403(){
        return "error/pages-error-403";
    }

}
