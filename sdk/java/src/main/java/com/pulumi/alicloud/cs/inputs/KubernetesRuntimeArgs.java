// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cs.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class KubernetesRuntimeArgs extends com.pulumi.resources.ResourceArgs {

    public static final KubernetesRuntimeArgs Empty = new KubernetesRuntimeArgs();

    /**
     * The name of the runtime. Supported runtimes can be queried by data source alicloud_cs_kubernetes_version.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the runtime. Supported runtimes can be queried by data source alicloud_cs_kubernetes_version.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The version of the runtime.
     * 
     * The following example is the definition of runtime block:
     * 
     */
    @Import(name="version")
    private @Nullable Output<String> version;

    /**
     * @return The version of the runtime.
     * 
     * The following example is the definition of runtime block:
     * 
     */
    public Optional<Output<String>> version() {
        return Optional.ofNullable(this.version);
    }

    private KubernetesRuntimeArgs() {}

    private KubernetesRuntimeArgs(KubernetesRuntimeArgs $) {
        this.name = $.name;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(KubernetesRuntimeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KubernetesRuntimeArgs $;

        public Builder() {
            $ = new KubernetesRuntimeArgs();
        }

        public Builder(KubernetesRuntimeArgs defaults) {
            $ = new KubernetesRuntimeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the runtime. Supported runtimes can be queried by data source alicloud_cs_kubernetes_version.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the runtime. Supported runtimes can be queried by data source alicloud_cs_kubernetes_version.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param version The version of the runtime.
         * 
         * The following example is the definition of runtime block:
         * 
         * @return builder
         * 
         */
        public Builder version(@Nullable Output<String> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version The version of the runtime.
         * 
         * The following example is the definition of runtime block:
         * 
         * @return builder
         * 
         */
        public Builder version(String version) {
            return version(Output.of(version));
        }

        public KubernetesRuntimeArgs build() {
            return $;
        }
    }

}