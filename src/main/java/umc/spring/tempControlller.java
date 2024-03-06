package umc.spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/temp")
public class tempControlller {

    @PostMapping("/success")
    public BaseResponse<String> successResponseAPI() {
        return BaseResponse.onSuccess("응답 성공");
    }
}
