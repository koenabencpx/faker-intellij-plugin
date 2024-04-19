module sdkmanapi {
    requires java.net.http;
    requires org.slf4j;
    requires org.apache.commons.compress;
    exports io.github.jagodevreede.sdkman.api;
    exports io.github.jagodevreede.sdkman.api.domain;
    exports io.github.jagodevreede.sdkman.api.http;
}