package com.devmaster.Customer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping("home")
	public String home() {
		return "index";
	}

	@GetMapping("shop-side-version-2")
	public String shopSideversion() {
		return "page/shop-side-version-2";
	}
	
	
	@GetMapping("product-detail")
	public String productDetail() {
		return "page/product-detail";
	}
	
	@GetMapping("signin")
	public String signin() {
		return "page/signin";
	}
	
	
	@GetMapping("lost-password")
	public String lostPassword() {
		return "page/lost-password";
	}
	
	
	@GetMapping("signup")
	public String signup() {
		return "page/signup";
	}
	
	@GetMapping("checkout")
	public String checkout() {
		return "page/checkout";
	}
	
	@GetMapping("cart")
	public String cart() {
		return "page/cart";
	}
	
	
	@GetMapping("dashboard")
	public String dashboard() {
		return "page/dashboard";
	}
	
	
	@GetMapping("dash-edit-profile")
	public String dashEditProfile() {
		return "page/dash-edit-profile";
	}
	
	@GetMapping("dash-address-book")
	public String dashAddressBook() {
		return "page/dash-address-book";
	}


	@GetMapping("dash-address-make-default")
	public String dashAddressMakeDefault() {
		return "page/dash-address-make-default";
	}
	
	@GetMapping("dash-address-add")
	public String dashAddressAdd() {
		return "page/dash-address-add";
	}
	
	@GetMapping("dash-address-edit")
	public String dashAddressEdit() {
		return "page/dash-address-edit";
	}
	
	@GetMapping("dash-track-order")
	public String dashTrackOrder() {
		return "page/dash-track-order";
	}
	
	@GetMapping("dash-my-profile")
	public String dashMyProfile() {
		return "page/dash-my-profile";
	}
	
	@GetMapping("dash-manage-order")
	public String dashManageOrder() {
		return "page/dash-manage-order";
	}
	
}
