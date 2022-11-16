// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.eci.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OpenApiImageCacheImageRegistryCredential {
    private final @Nullable String password;
    private final @Nullable String server;
    private final @Nullable String userName;

    @CustomType.Constructor
    private OpenApiImageCacheImageRegistryCredential(
        @CustomType.Parameter("password") @Nullable String password,
        @CustomType.Parameter("server") @Nullable String server,
        @CustomType.Parameter("userName") @Nullable String userName) {
        this.password = password;
        this.server = server;
        this.userName = userName;
    }

    public Optional<String> password() {
        return Optional.ofNullable(this.password);
    }
    public Optional<String> server() {
        return Optional.ofNullable(this.server);
    }
    public Optional<String> userName() {
        return Optional.ofNullable(this.userName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OpenApiImageCacheImageRegistryCredential defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String password;
        private @Nullable String server;
        private @Nullable String userName;

        public Builder() {
    	      // Empty
        }

        public Builder(OpenApiImageCacheImageRegistryCredential defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.password = defaults.password;
    	      this.server = defaults.server;
    	      this.userName = defaults.userName;
        }

        public Builder password(@Nullable String password) {
            this.password = password;
            return this;
        }
        public Builder server(@Nullable String server) {
            this.server = server;
            return this;
        }
        public Builder userName(@Nullable String userName) {
            this.userName = userName;
            return this;
        }        public OpenApiImageCacheImageRegistryCredential build() {
            return new OpenApiImageCacheImageRegistryCredential(password, server, userName);
        }
    }
}