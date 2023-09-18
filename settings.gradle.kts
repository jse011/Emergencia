import java.net.URI

pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven {
            url = URI("https://esri.jfrog.io/artifactory/arcgis")
        }
    }
}

rootProject.name = "Emergencia"
include(":app")
include(":core:data")
include(":core:model")
include(":core:datastore")
