// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.eci.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ContainerGroupImageRegistryCredentialArgs extends com.pulumi.resources.ResourceArgs {

    public static final ContainerGroupImageRegistryCredentialArgs Empty = new ContainerGroupImageRegistryCredentialArgs();

    /**
     * The password used to log on to the image repository. It is required when `image_registry_credential` is configured.
     * 
     */
    @Import(name="password", required=true)
    private Output<String> password;

    /**
     * @return The password used to log on to the image repository. It is required when `image_registry_credential` is configured.
     * 
     */
    public Output<String> password() {
        return this.password;
    }

    /**
     * The address of the image repository. It is required when `image_registry_credential` is configured.
     * 
     */
    @Import(name="server", required=true)
    private Output<String> server;

    /**
     * @return The address of the image repository. It is required when `image_registry_credential` is configured.
     * 
     */
    public Output<String> server() {
        return this.server;
    }

    /**
     * The username used to log on to the image repository. It is required when `image_registry_credential` is configured.
     * 
     */
    @Import(name="userName", required=true)
    private Output<String> userName;

    /**
     * @return The username used to log on to the image repository. It is required when `image_registry_credential` is configured.
     * 
     */
    public Output<String> userName() {
        return this.userName;
    }

    private ContainerGroupImageRegistryCredentialArgs() {}

    private ContainerGroupImageRegistryCredentialArgs(ContainerGroupImageRegistryCredentialArgs $) {
        this.password = $.password;
        this.server = $.server;
        this.userName = $.userName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ContainerGroupImageRegistryCredentialArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ContainerGroupImageRegistryCredentialArgs $;

        public Builder() {
            $ = new ContainerGroupImageRegistryCredentialArgs();
        }

        public Builder(ContainerGroupImageRegistryCredentialArgs defaults) {
            $ = new ContainerGroupImageRegistryCredentialArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param password The password used to log on to the image repository. It is required when `image_registry_credential` is configured.
         * 
         * @return builder
         * 
         */
        public Builder password(Output<String> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password The password used to log on to the image repository. It is required when `image_registry_credential` is configured.
         * 
         * @return builder
         * 
         */
        public Builder password(String password) {
            return password(Output.of(password));
        }

        /**
         * @param server The address of the image repository. It is required when `image_registry_credential` is configured.
         * 
         * @return builder
         * 
         */
        public Builder server(Output<String> server) {
            $.server = server;
            return this;
        }

        /**
         * @param server The address of the image repository. It is required when `image_registry_credential` is configured.
         * 
         * @return builder
         * 
         */
        public Builder server(String server) {
            return server(Output.of(server));
        }

        /**
         * @param userName The username used to log on to the image repository. It is required when `image_registry_credential` is configured.
         * 
         * @return builder
         * 
         */
        public Builder userName(Output<String> userName) {
            $.userName = userName;
            return this;
        }

        /**
         * @param userName The username used to log on to the image repository. It is required when `image_registry_credential` is configured.
         * 
         * @return builder
         * 
         */
        public Builder userName(String userName) {
            return userName(Output.of(userName));
        }

        public ContainerGroupImageRegistryCredentialArgs build() {
            $.password = Objects.requireNonNull($.password, "expected parameter 'password' to be non-null");
            $.server = Objects.requireNonNull($.server, "expected parameter 'server' to be non-null");
            $.userName = Objects.requireNonNull($.userName, "expected parameter 'userName' to be non-null");
            return $;
        }
    }

}