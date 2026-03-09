rootProject.name = "app"

plugins {
    id("org.danilopianini.gradle-pre-commit-git-hooks") version "2.1.10"
}

gitHooks {
    preCommit {
        tasks("spotlessCheck", "check")
    }

    commitMsg {
        conventionalCommits()
    }

    createHooks(true)
}
