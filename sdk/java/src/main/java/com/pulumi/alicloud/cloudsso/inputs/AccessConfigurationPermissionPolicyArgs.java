// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cloudsso.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AccessConfigurationPermissionPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final AccessConfigurationPermissionPolicyArgs Empty = new AccessConfigurationPermissionPolicyArgs();

    /**
     * The Content of Policy.
     * 
     */
    @Import(name="permissionPolicyDocument")
    private @Nullable Output<String> permissionPolicyDocument;

    /**
     * @return The Content of Policy.
     * 
     */
    public Optional<Output<String>> permissionPolicyDocument() {
        return Optional.ofNullable(this.permissionPolicyDocument);
    }

    /**
     * The Policy Name of policy. The name of the resource.
     * 
     */
    @Import(name="permissionPolicyName", required=true)
    private Output<String> permissionPolicyName;

    /**
     * @return The Policy Name of policy. The name of the resource.
     * 
     */
    public Output<String> permissionPolicyName() {
        return this.permissionPolicyName;
    }

    /**
     * The Policy Type of policy. Valid values: `System`, `Inline`.
     * 
     */
    @Import(name="permissionPolicyType", required=true)
    private Output<String> permissionPolicyType;

    /**
     * @return The Policy Type of policy. Valid values: `System`, `Inline`.
     * 
     */
    public Output<String> permissionPolicyType() {
        return this.permissionPolicyType;
    }

    private AccessConfigurationPermissionPolicyArgs() {}

    private AccessConfigurationPermissionPolicyArgs(AccessConfigurationPermissionPolicyArgs $) {
        this.permissionPolicyDocument = $.permissionPolicyDocument;
        this.permissionPolicyName = $.permissionPolicyName;
        this.permissionPolicyType = $.permissionPolicyType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccessConfigurationPermissionPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccessConfigurationPermissionPolicyArgs $;

        public Builder() {
            $ = new AccessConfigurationPermissionPolicyArgs();
        }

        public Builder(AccessConfigurationPermissionPolicyArgs defaults) {
            $ = new AccessConfigurationPermissionPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param permissionPolicyDocument The Content of Policy.
         * 
         * @return builder
         * 
         */
        public Builder permissionPolicyDocument(@Nullable Output<String> permissionPolicyDocument) {
            $.permissionPolicyDocument = permissionPolicyDocument;
            return this;
        }

        /**
         * @param permissionPolicyDocument The Content of Policy.
         * 
         * @return builder
         * 
         */
        public Builder permissionPolicyDocument(String permissionPolicyDocument) {
            return permissionPolicyDocument(Output.of(permissionPolicyDocument));
        }

        /**
         * @param permissionPolicyName The Policy Name of policy. The name of the resource.
         * 
         * @return builder
         * 
         */
        public Builder permissionPolicyName(Output<String> permissionPolicyName) {
            $.permissionPolicyName = permissionPolicyName;
            return this;
        }

        /**
         * @param permissionPolicyName The Policy Name of policy. The name of the resource.
         * 
         * @return builder
         * 
         */
        public Builder permissionPolicyName(String permissionPolicyName) {
            return permissionPolicyName(Output.of(permissionPolicyName));
        }

        /**
         * @param permissionPolicyType The Policy Type of policy. Valid values: `System`, `Inline`.
         * 
         * @return builder
         * 
         */
        public Builder permissionPolicyType(Output<String> permissionPolicyType) {
            $.permissionPolicyType = permissionPolicyType;
            return this;
        }

        /**
         * @param permissionPolicyType The Policy Type of policy. Valid values: `System`, `Inline`.
         * 
         * @return builder
         * 
         */
        public Builder permissionPolicyType(String permissionPolicyType) {
            return permissionPolicyType(Output.of(permissionPolicyType));
        }

        public AccessConfigurationPermissionPolicyArgs build() {
            if ($.permissionPolicyName == null) {
                throw new MissingRequiredPropertyException("AccessConfigurationPermissionPolicyArgs", "permissionPolicyName");
            }
            if ($.permissionPolicyType == null) {
                throw new MissingRequiredPropertyException("AccessConfigurationPermissionPolicyArgs", "permissionPolicyType");
            }
            return $;
        }
    }

}