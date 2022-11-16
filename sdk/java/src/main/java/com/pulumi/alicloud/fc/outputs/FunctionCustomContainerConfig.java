// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.fc.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FunctionCustomContainerConfig {
    /**
     * @return The args field specifies the arguments passed to the command.
     * 
     */
    private final @Nullable String args;
    /**
     * @return The entry point of the container, which specifies the actual command run by the container.
     * 
     */
    private final @Nullable String command;
    /**
     * @return The container image address.
     * 
     */
    private final String image;

    @CustomType.Constructor
    private FunctionCustomContainerConfig(
        @CustomType.Parameter("args") @Nullable String args,
        @CustomType.Parameter("command") @Nullable String command,
        @CustomType.Parameter("image") String image) {
        this.args = args;
        this.command = command;
        this.image = image;
    }

    /**
     * @return The args field specifies the arguments passed to the command.
     * 
     */
    public Optional<String> args() {
        return Optional.ofNullable(this.args);
    }
    /**
     * @return The entry point of the container, which specifies the actual command run by the container.
     * 
     */
    public Optional<String> command() {
        return Optional.ofNullable(this.command);
    }
    /**
     * @return The container image address.
     * 
     */
    public String image() {
        return this.image;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FunctionCustomContainerConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String args;
        private @Nullable String command;
        private String image;

        public Builder() {
    	      // Empty
        }

        public Builder(FunctionCustomContainerConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.args = defaults.args;
    	      this.command = defaults.command;
    	      this.image = defaults.image;
        }

        public Builder args(@Nullable String args) {
            this.args = args;
            return this;
        }
        public Builder command(@Nullable String command) {
            this.command = command;
            return this;
        }
        public Builder image(String image) {
            this.image = Objects.requireNonNull(image);
            return this;
        }        public FunctionCustomContainerConfig build() {
            return new FunctionCustomContainerConfig(args, command, image);
        }
    }
}