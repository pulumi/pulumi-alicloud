// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.fc.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class V3FunctionNasConfigMountPointArgs extends com.pulumi.resources.ResourceArgs {

    public static final V3FunctionNasConfigMountPointArgs Empty = new V3FunctionNasConfigMountPointArgs();

    /**
     * Use transport encryption to mount. Note: only general-purpose NAS supports transmission encryption.
     * 
     */
    @Import(name="enableTls")
    private @Nullable Output<Boolean> enableTls;

    /**
     * @return Use transport encryption to mount. Note: only general-purpose NAS supports transmission encryption.
     * 
     */
    public Optional<Output<Boolean>> enableTls() {
        return Optional.ofNullable(this.enableTls);
    }

    @Import(name="mountDir")
    private @Nullable Output<String> mountDir;

    public Optional<Output<String>> mountDir() {
        return Optional.ofNullable(this.mountDir);
    }

    /**
     * NAS server address
     * 
     */
    @Import(name="serverAddr")
    private @Nullable Output<String> serverAddr;

    /**
     * @return NAS server address
     * 
     */
    public Optional<Output<String>> serverAddr() {
        return Optional.ofNullable(this.serverAddr);
    }

    private V3FunctionNasConfigMountPointArgs() {}

    private V3FunctionNasConfigMountPointArgs(V3FunctionNasConfigMountPointArgs $) {
        this.enableTls = $.enableTls;
        this.mountDir = $.mountDir;
        this.serverAddr = $.serverAddr;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(V3FunctionNasConfigMountPointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private V3FunctionNasConfigMountPointArgs $;

        public Builder() {
            $ = new V3FunctionNasConfigMountPointArgs();
        }

        public Builder(V3FunctionNasConfigMountPointArgs defaults) {
            $ = new V3FunctionNasConfigMountPointArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enableTls Use transport encryption to mount. Note: only general-purpose NAS supports transmission encryption.
         * 
         * @return builder
         * 
         */
        public Builder enableTls(@Nullable Output<Boolean> enableTls) {
            $.enableTls = enableTls;
            return this;
        }

        /**
         * @param enableTls Use transport encryption to mount. Note: only general-purpose NAS supports transmission encryption.
         * 
         * @return builder
         * 
         */
        public Builder enableTls(Boolean enableTls) {
            return enableTls(Output.of(enableTls));
        }

        public Builder mountDir(@Nullable Output<String> mountDir) {
            $.mountDir = mountDir;
            return this;
        }

        public Builder mountDir(String mountDir) {
            return mountDir(Output.of(mountDir));
        }

        /**
         * @param serverAddr NAS server address
         * 
         * @return builder
         * 
         */
        public Builder serverAddr(@Nullable Output<String> serverAddr) {
            $.serverAddr = serverAddr;
            return this;
        }

        /**
         * @param serverAddr NAS server address
         * 
         * @return builder
         * 
         */
        public Builder serverAddr(String serverAddr) {
            return serverAddr(Output.of(serverAddr));
        }

        public V3FunctionNasConfigMountPointArgs build() {
            return $;
        }
    }

}
