package com.github.alenavorozhbieva.template.services

import com.intellij.openapi.project.Project
import com.github.alenavorozhbieva.template.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
