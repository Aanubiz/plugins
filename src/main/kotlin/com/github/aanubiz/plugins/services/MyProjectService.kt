package com.github.aanubiz.plugins.services

import com.intellij.openapi.project.Project
import com.github.aanubiz.plugins.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
