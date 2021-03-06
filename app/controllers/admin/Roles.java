package controllers.admin;

import play.*;
import play.data.*;
import play.mvc.*;

import controllers.*;
import models.*;
import views.html.*;

@Security.Authenticated(Secured.class)
public class Roles extends Controller {

	public static Result index() {
		User user = User.find.where().eq("username", request().username()).findUnique();
		if (user.isAdmin) {
			return ok(views.html.roles_admin.render(user, Role.find.all()));
		}
		else {
			return redirect("/");
		}
	}

	public static Result role(Long id) {
		User user = User.find.where().eq("username", request().username()).findUnique();
		if (user.isAdmin) {
			return ok(views.html.role_admin.render(user, Role.find.ref(id)));
		}
		else {
			return redirect("/");
		}
	}

}
