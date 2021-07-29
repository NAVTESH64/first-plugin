package com.github.navtesh64.firstplugin.services

import com.github.navtesh64.firstplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
