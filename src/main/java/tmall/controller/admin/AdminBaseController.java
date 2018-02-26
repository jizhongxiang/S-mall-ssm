package tmall.controller.admin;

import tmall.controller.BaseController;
import tmall.annotation.Auth;
import tmall.pojo.User;

/**
 * Controller基类
 */
@Auth(User.Group.superAdmin)
public class AdminBaseController extends BaseController {

}
