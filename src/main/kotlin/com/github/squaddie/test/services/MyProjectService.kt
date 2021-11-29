package com.github.squaddie.test.services

import com.intellij.openapi.project.Project
import com.github.squaddie.test.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
