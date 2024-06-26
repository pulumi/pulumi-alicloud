// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.sae.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApplicationNasConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApplicationNasConfigArgs Empty = new ApplicationNasConfigArgs();

    /**
     * The domain name of the mount target.
     * 
     */
    @Import(name="mountDomain")
    private @Nullable Output<String> mountDomain;

    /**
     * @return The domain name of the mount target.
     * 
     */
    public Optional<Output<String>> mountDomain() {
        return Optional.ofNullable(this.mountDomain);
    }

    /**
     * The mount path of the container.
     * 
     */
    @Import(name="mountPath")
    private @Nullable Output<String> mountPath;

    /**
     * @return The mount path of the container.
     * 
     */
    public Optional<Output<String>> mountPath() {
        return Optional.ofNullable(this.mountPath);
    }

    /**
     * The ID of the NAS file system.
     * 
     */
    @Import(name="nasId")
    private @Nullable Output<String> nasId;

    /**
     * @return The ID of the NAS file system.
     * 
     */
    public Optional<Output<String>> nasId() {
        return Optional.ofNullable(this.nasId);
    }

    /**
     * The directory in the NAS file system.
     * 
     */
    @Import(name="nasPath")
    private @Nullable Output<String> nasPath;

    /**
     * @return The directory in the NAS file system.
     * 
     */
    public Optional<Output<String>> nasPath() {
        return Optional.ofNullable(this.nasPath);
    }

    /**
     * Specifies whether the application can read data from or write data to resources in the directory of the NAS. Valid values: `true` and `false`. If you set `read_only` to `false`, the application has the read and write permissions.
     * 
     */
    @Import(name="readOnly")
    private @Nullable Output<Boolean> readOnly;

    /**
     * @return Specifies whether the application can read data from or write data to resources in the directory of the NAS. Valid values: `true` and `false`. If you set `read_only` to `false`, the application has the read and write permissions.
     * 
     */
    public Optional<Output<Boolean>> readOnly() {
        return Optional.ofNullable(this.readOnly);
    }

    private ApplicationNasConfigArgs() {}

    private ApplicationNasConfigArgs(ApplicationNasConfigArgs $) {
        this.mountDomain = $.mountDomain;
        this.mountPath = $.mountPath;
        this.nasId = $.nasId;
        this.nasPath = $.nasPath;
        this.readOnly = $.readOnly;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplicationNasConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplicationNasConfigArgs $;

        public Builder() {
            $ = new ApplicationNasConfigArgs();
        }

        public Builder(ApplicationNasConfigArgs defaults) {
            $ = new ApplicationNasConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param mountDomain The domain name of the mount target.
         * 
         * @return builder
         * 
         */
        public Builder mountDomain(@Nullable Output<String> mountDomain) {
            $.mountDomain = mountDomain;
            return this;
        }

        /**
         * @param mountDomain The domain name of the mount target.
         * 
         * @return builder
         * 
         */
        public Builder mountDomain(String mountDomain) {
            return mountDomain(Output.of(mountDomain));
        }

        /**
         * @param mountPath The mount path of the container.
         * 
         * @return builder
         * 
         */
        public Builder mountPath(@Nullable Output<String> mountPath) {
            $.mountPath = mountPath;
            return this;
        }

        /**
         * @param mountPath The mount path of the container.
         * 
         * @return builder
         * 
         */
        public Builder mountPath(String mountPath) {
            return mountPath(Output.of(mountPath));
        }

        /**
         * @param nasId The ID of the NAS file system.
         * 
         * @return builder
         * 
         */
        public Builder nasId(@Nullable Output<String> nasId) {
            $.nasId = nasId;
            return this;
        }

        /**
         * @param nasId The ID of the NAS file system.
         * 
         * @return builder
         * 
         */
        public Builder nasId(String nasId) {
            return nasId(Output.of(nasId));
        }

        /**
         * @param nasPath The directory in the NAS file system.
         * 
         * @return builder
         * 
         */
        public Builder nasPath(@Nullable Output<String> nasPath) {
            $.nasPath = nasPath;
            return this;
        }

        /**
         * @param nasPath The directory in the NAS file system.
         * 
         * @return builder
         * 
         */
        public Builder nasPath(String nasPath) {
            return nasPath(Output.of(nasPath));
        }

        /**
         * @param readOnly Specifies whether the application can read data from or write data to resources in the directory of the NAS. Valid values: `true` and `false`. If you set `read_only` to `false`, the application has the read and write permissions.
         * 
         * @return builder
         * 
         */
        public Builder readOnly(@Nullable Output<Boolean> readOnly) {
            $.readOnly = readOnly;
            return this;
        }

        /**
         * @param readOnly Specifies whether the application can read data from or write data to resources in the directory of the NAS. Valid values: `true` and `false`. If you set `read_only` to `false`, the application has the read and write permissions.
         * 
         * @return builder
         * 
         */
        public Builder readOnly(Boolean readOnly) {
            return readOnly(Output.of(readOnly));
        }

        public ApplicationNasConfigArgs build() {
            return $;
        }
    }

}
