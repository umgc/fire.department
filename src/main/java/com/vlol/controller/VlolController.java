/**
 * Application controller class.
 *
 * Java Runtime Environment (JRE) version used: 11.0.7
 * Java Development Kit (JDK) version used: 11.0.7
 *
 * Styling guide: Google Java Style Guide
 *     (https://google.github.io/styleguide/javaguide.html) and
 *     Code Conventions for the Java Programming Language (Oracle: Deprecated)
 *     (https://www.oracle.com/technetwork/java/javase/documentation/codeconvtoc-136057.html)
 *
 * @category  vlol
 * @package controller
 * @author Rob Garcia <rgarcia92@student.umgc.edu>
 * @license https://opensource.org/licenses/MIT The MIT License
 * @link      https://github.com/garciart/SWEN670
 * @copyright 2020 EMS Plus
 */
package com.vlol.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Application controller class.
 *
 * @author Rob Garcia <rgarcia92@student.umgc.edu>
 */
@Controller
public class VlolController {

    @Value("${spring.application.name}")
    String appName;

    /**
     * Maps the landing page to a view
     *
     * @param model Spring's built-in UI model.
     * @return The landing page view.
     */
    @GetMapping("/")
    public String viewHomePage(Model model) {
        model.addAttribute("appName", appName);
        return "index";
    }

    @GetMapping("/admin-menu")
    public String viewMainMenu(Model model) {
        return "admin/admin-menu";
    }

    @GetMapping("/about")
    public String viewAboutPage(Model model) {
        return "about";
    }

    @GetMapping("/contact")
    public String viewContactPage(Model model) {
        return "contact";
    }

    @GetMapping("/access-denied")
    public String viewAccessDeniedPage(Model model) {
        return "access-denied";
    }
}
