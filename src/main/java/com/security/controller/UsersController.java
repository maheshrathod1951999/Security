/* 
* Generated by
* 
*      _____ _          __  __      _     _
*     / ____| |        / _|/ _|    | |   | |
*    | (___ | | ____ _| |_| |_ ___ | | __| | ___ _ __
*     \___ \| |/ / _` |  _|  _/ _ \| |/ _` |/ _ \ '__|
*     ____) |   < (_| | | | || (_) | | (_| |  __/ |
*    |_____/|_|\_\__,_|_| |_| \___/|_|\__,_|\___|_|
*
* The code generator that works in many programming languages
*
*			https://www.skaffolder.com
*
*
* You can generate the code from the command-line
*       https://npmjs.com/package/skaffolder-cli
*
*       npm install -g skaffodler-cli
*
*   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *
*
* To remove this comment please upgrade your plan here: 
*      https://app.skaffolder.com/#!/upgrade
*
* Or get up to 70% discount sharing your unique link:
*       https://app.skaffolder.com/#!/register?friend=5e55338952a8e9561a0d078c
*
* You will get 10% discount for each one of your friends
* 
*/
package com.security.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.security.db.security_db.mapper.Users;
import com.security.db.security_db.service.UsersService;


@RestController
public class UsersController {

	UsersService usersService = new UsersService();

    //CRUD - CREATE
    @Secured({"ROLE_ADMIN" })
	@RequestMapping(value = "/Users", method = RequestMethod.POST, headers = "Accept=application/json")
	public Users insert(@RequestBody Users obj) {
		Users result = usersService.insert(obj);
		return result;
	}
	
    //CRUD - GET ONE
    @Secured({"ROLE_ADMIN" })
	@RequestMapping(value = "/Users/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	public Users get(@PathVariable Long id) {
		Users obj = usersService.get(id);
		return obj;
	}
	
	
    //CRUD - GET LIST
    @Secured({"ROLE_ADMIN" })
	@RequestMapping(value = "/Users", method = RequestMethod.GET, headers = "Accept=application/json")
	public List<Users> getList() {
		List<Users> list = usersService.getList();
		return list;
	}
	

    //CRUD - EDIT
    @Secured({"ROLE_PRIVATE_USER" })
	@RequestMapping(value = "/Users/{id}", method = RequestMethod.POST, headers = "Accept=application/json")
	public Users update(@RequestBody Users obj, @PathVariable("id") Long id) {
		Users result = usersService.update(obj, id);
		return result;
	}

    //CRUD - REMOVE
    @Secured({"ROLE_ADMIN" })
	@RequestMapping(value = "/Users/{id}", method = RequestMethod.DELETE, headers = "Accept=application/json")
	public void delete(@PathVariable("id") Long id) {
		usersService.delete(id);
	}

    /**
     * Change password for ADMIN user
     */
    @Secured({"ROLE_ADMIN" })
	@RequestMapping(value = "/Users/{id}/changePassword", method = RequestMethod.POST, headers = "Accept=application/json")
	public void changePassword(HttpServletRequest request, HttpServletResponse response, @RequestBody Map<String, String> params, @PathVariable("id") Long id) {
		try {
			usersService.changePassword(id, params);
		} catch (Exception e) {
			e.printStackTrace();
			response.setStatus(500);
		}
	}
	

	
	/*
	 * CUSTOM SERVICES
	 * 
	 */


	
}
