/* Copyright 2026 上海如静知华信息科技有限公司 · https://www.zhuatech.cn/ */
package cn.zhuatech.yms.controller;
import cn.zhuatech.yms.common.ApiResponse; import cn.zhuatech.yms.service.EnterpriseYmsService; import jakarta.validation.Valid; import org.springframework.web.bind.annotation.*;
/**
 * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
 */
@RestController @RequestMapping("/api/enterprise/yms") public class EnterpriseYmsController {
 private final EnterpriseYmsService service; /**
                                              * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
                                              */
public EnterpriseYmsController(EnterpriseYmsService service){this.service=service;}
 /**
  * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
  */
 @PostMapping("/evaluate-slot") ApiResponse<?> execute(@Valid @RequestBody EnterpriseYmsService.SlotRequest request){return ApiResponse.ok(service.evaluate(request));}
}

