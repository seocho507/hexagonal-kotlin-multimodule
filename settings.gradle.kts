plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
}
rootProject.name = "hexagonal-kotlin-multimodule"
include("membership-service")
include("common")
include("waiting-room-service")
