package hello.springmvc.basic.requestmapping;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
public class MappingController {

  @RequestMapping("/hello-basic")
  public String helloBasic() {
    log.info("helloBasic");
    return "ok";
  }

  @GetMapping(value = "/mapping-get-v1")
  public String mappingGetV1() {
    log.info("mappingGetV1");
    return "ok";
  }

  @GetMapping(value = "/mapping-get-v2")
  public String mappingGetV2() {
    log.info("mappingGetV2");
    return "ok";
  }

  /**
   * PathVariable 사용
   *
   * @return
   */
  @GetMapping("/mapping/{userId}")
  public String mappingPath(@PathVariable("userId") String data) {
    log.info("mappingPath userId={}", data);
    return "ok";
  }

  @GetMapping("/mapping/users/{userId}/orders/{orderId}")
  public String mappingPath(@PathVariable String userId, @PathVariable Long orderId) {
    log.info("mappingPath userId={}, orderId={}", userId, orderId);
    return "ok";
  }

  @GetMapping(value = "/mapping-param", params = "mode=debug")
  public String mappingParam() {
    log.info("mappingParam");
    return "ok";
  }

  @PostMapping(value = "/mapping-consume", consumes = "application/json")
  public String mappingConsumes(){
    log.info("mappingConsumes");
    return "ok";
  }

  @PostMapping(value = "/mapping-produce", produces = "text/html")
  public String mappingProduces(){
    log.info("mappingProduces");
    return "ok";
  }
}
