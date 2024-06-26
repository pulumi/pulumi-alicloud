// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.fc.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class V2FunctionCustomContainerConfig {
    /**
     * @return Image acceleration type. The value Default is to enable acceleration and None is to disable acceleration.
     * 
     */
    private @Nullable String accelerationType;
    /**
     * @return Container startup parameters.
     * 
     */
    private @Nullable String args;
    /**
     * @return Container start command, equivalent to Docker ENTRYPOINT.
     * 
     */
    private @Nullable String command;
    /**
     * @return Container Image address. Example value: registry-vpc.cn-hangzhou.aliyuncs.com/fc-demo/helloworld:v1beta1.
     * 
     */
    private @Nullable String image;
    /**
     * @return Whether the image is run in Web Server mode. The value of true needs to implement the Web Server in the container image to listen to the port and process the request. The value of false needs to actively exit the process after the container runs, and the ExitCode needs to be 0. Default true.
     * 
     */
    private @Nullable Boolean webServerMode;

    private V2FunctionCustomContainerConfig() {}
    /**
     * @return Image acceleration type. The value Default is to enable acceleration and None is to disable acceleration.
     * 
     */
    public Optional<String> accelerationType() {
        return Optional.ofNullable(this.accelerationType);
    }
    /**
     * @return Container startup parameters.
     * 
     */
    public Optional<String> args() {
        return Optional.ofNullable(this.args);
    }
    /**
     * @return Container start command, equivalent to Docker ENTRYPOINT.
     * 
     */
    public Optional<String> command() {
        return Optional.ofNullable(this.command);
    }
    /**
     * @return Container Image address. Example value: registry-vpc.cn-hangzhou.aliyuncs.com/fc-demo/helloworld:v1beta1.
     * 
     */
    public Optional<String> image() {
        return Optional.ofNullable(this.image);
    }
    /**
     * @return Whether the image is run in Web Server mode. The value of true needs to implement the Web Server in the container image to listen to the port and process the request. The value of false needs to actively exit the process after the container runs, and the ExitCode needs to be 0. Default true.
     * 
     */
    public Optional<Boolean> webServerMode() {
        return Optional.ofNullable(this.webServerMode);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(V2FunctionCustomContainerConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String accelerationType;
        private @Nullable String args;
        private @Nullable String command;
        private @Nullable String image;
        private @Nullable Boolean webServerMode;
        public Builder() {}
        public Builder(V2FunctionCustomContainerConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accelerationType = defaults.accelerationType;
    	      this.args = defaults.args;
    	      this.command = defaults.command;
    	      this.image = defaults.image;
    	      this.webServerMode = defaults.webServerMode;
        }

        @CustomType.Setter
        public Builder accelerationType(@Nullable String accelerationType) {

            this.accelerationType = accelerationType;
            return this;
        }
        @CustomType.Setter
        public Builder args(@Nullable String args) {

            this.args = args;
            return this;
        }
        @CustomType.Setter
        public Builder command(@Nullable String command) {

            this.command = command;
            return this;
        }
        @CustomType.Setter
        public Builder image(@Nullable String image) {

            this.image = image;
            return this;
        }
        @CustomType.Setter
        public Builder webServerMode(@Nullable Boolean webServerMode) {

            this.webServerMode = webServerMode;
            return this;
        }
        public V2FunctionCustomContainerConfig build() {
            final var _resultValue = new V2FunctionCustomContainerConfig();
            _resultValue.accelerationType = accelerationType;
            _resultValue.args = args;
            _resultValue.command = command;
            _resultValue.image = image;
            _resultValue.webServerMode = webServerMode;
            return _resultValue;
        }
    }
}
