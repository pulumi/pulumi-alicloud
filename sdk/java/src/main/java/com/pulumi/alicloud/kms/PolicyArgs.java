// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.kms;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final PolicyArgs Empty = new PolicyArgs();

    /**
     * Network Rules in JSON struct.
     * 
     */
    @Import(name="accessControlRules", required=true)
    private Output<String> accessControlRules;

    /**
     * @return Network Rules in JSON struct.
     * 
     */
    public Output<String> accessControlRules() {
        return this.accessControlRules;
    }

    /**
     * Description.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Description.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * KMS instance .
     * 
     */
    @Import(name="kmsInstanceId", required=true)
    private Output<String> kmsInstanceId;

    /**
     * @return KMS instance .
     * 
     */
    public Output<String> kmsInstanceId() {
        return this.kmsInstanceId;
    }

    /**
     * Allowed permissions (RBAC)Optional values:&#34;RbacPermission/Template/CryptoServiceKeyUser&#34; and &#34;RbacPermission/Template/CryptoServiceSecretUser&#34;.
     * 
     */
    @Import(name="permissions", required=true)
    private Output<List<String>> permissions;

    /**
     * @return Allowed permissions (RBAC)Optional values:&#34;RbacPermission/Template/CryptoServiceKeyUser&#34; and &#34;RbacPermission/Template/CryptoServiceSecretUser&#34;.
     * 
     */
    public Output<List<String>> permissions() {
        return this.permissions;
    }

    /**
     * Policy Name.
     * 
     */
    @Import(name="policyName", required=true)
    private Output<String> policyName;

    /**
     * @return Policy Name.
     * 
     */
    public Output<String> policyName() {
        return this.policyName;
    }

    /**
     * The resources that the permission policy allows to access.Use &#34;key/${KeyId}&#34; or &#34;key/*&#34;  to specify a key or all keys.Use &#34;secret/${SecretName}&#34; or &#34;secret/*&#34; to specify a secret or all secrets.
     * 
     */
    @Import(name="resources", required=true)
    private Output<List<String>> resources;

    /**
     * @return The resources that the permission policy allows to access.Use &#34;key/${KeyId}&#34; or &#34;key/*&#34;  to specify a key or all keys.Use &#34;secret/${SecretName}&#34; or &#34;secret/*&#34; to specify a secret or all secrets.
     * 
     */
    public Output<List<String>> resources() {
        return this.resources;
    }

    private PolicyArgs() {}

    private PolicyArgs(PolicyArgs $) {
        this.accessControlRules = $.accessControlRules;
        this.description = $.description;
        this.kmsInstanceId = $.kmsInstanceId;
        this.permissions = $.permissions;
        this.policyName = $.policyName;
        this.resources = $.resources;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PolicyArgs $;

        public Builder() {
            $ = new PolicyArgs();
        }

        public Builder(PolicyArgs defaults) {
            $ = new PolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessControlRules Network Rules in JSON struct.
         * 
         * @return builder
         * 
         */
        public Builder accessControlRules(Output<String> accessControlRules) {
            $.accessControlRules = accessControlRules;
            return this;
        }

        /**
         * @param accessControlRules Network Rules in JSON struct.
         * 
         * @return builder
         * 
         */
        public Builder accessControlRules(String accessControlRules) {
            return accessControlRules(Output.of(accessControlRules));
        }

        /**
         * @param description Description.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param kmsInstanceId KMS instance .
         * 
         * @return builder
         * 
         */
        public Builder kmsInstanceId(Output<String> kmsInstanceId) {
            $.kmsInstanceId = kmsInstanceId;
            return this;
        }

        /**
         * @param kmsInstanceId KMS instance .
         * 
         * @return builder
         * 
         */
        public Builder kmsInstanceId(String kmsInstanceId) {
            return kmsInstanceId(Output.of(kmsInstanceId));
        }

        /**
         * @param permissions Allowed permissions (RBAC)Optional values:&#34;RbacPermission/Template/CryptoServiceKeyUser&#34; and &#34;RbacPermission/Template/CryptoServiceSecretUser&#34;.
         * 
         * @return builder
         * 
         */
        public Builder permissions(Output<List<String>> permissions) {
            $.permissions = permissions;
            return this;
        }

        /**
         * @param permissions Allowed permissions (RBAC)Optional values:&#34;RbacPermission/Template/CryptoServiceKeyUser&#34; and &#34;RbacPermission/Template/CryptoServiceSecretUser&#34;.
         * 
         * @return builder
         * 
         */
        public Builder permissions(List<String> permissions) {
            return permissions(Output.of(permissions));
        }

        /**
         * @param permissions Allowed permissions (RBAC)Optional values:&#34;RbacPermission/Template/CryptoServiceKeyUser&#34; and &#34;RbacPermission/Template/CryptoServiceSecretUser&#34;.
         * 
         * @return builder
         * 
         */
        public Builder permissions(String... permissions) {
            return permissions(List.of(permissions));
        }

        /**
         * @param policyName Policy Name.
         * 
         * @return builder
         * 
         */
        public Builder policyName(Output<String> policyName) {
            $.policyName = policyName;
            return this;
        }

        /**
         * @param policyName Policy Name.
         * 
         * @return builder
         * 
         */
        public Builder policyName(String policyName) {
            return policyName(Output.of(policyName));
        }

        /**
         * @param resources The resources that the permission policy allows to access.Use &#34;key/${KeyId}&#34; or &#34;key/*&#34;  to specify a key or all keys.Use &#34;secret/${SecretName}&#34; or &#34;secret/*&#34; to specify a secret or all secrets.
         * 
         * @return builder
         * 
         */
        public Builder resources(Output<List<String>> resources) {
            $.resources = resources;
            return this;
        }

        /**
         * @param resources The resources that the permission policy allows to access.Use &#34;key/${KeyId}&#34; or &#34;key/*&#34;  to specify a key or all keys.Use &#34;secret/${SecretName}&#34; or &#34;secret/*&#34; to specify a secret or all secrets.
         * 
         * @return builder
         * 
         */
        public Builder resources(List<String> resources) {
            return resources(Output.of(resources));
        }

        /**
         * @param resources The resources that the permission policy allows to access.Use &#34;key/${KeyId}&#34; or &#34;key/*&#34;  to specify a key or all keys.Use &#34;secret/${SecretName}&#34; or &#34;secret/*&#34; to specify a secret or all secrets.
         * 
         * @return builder
         * 
         */
        public Builder resources(String... resources) {
            return resources(List.of(resources));
        }

        public PolicyArgs build() {
            if ($.accessControlRules == null) {
                throw new MissingRequiredPropertyException("PolicyArgs", "accessControlRules");
            }
            if ($.kmsInstanceId == null) {
                throw new MissingRequiredPropertyException("PolicyArgs", "kmsInstanceId");
            }
            if ($.permissions == null) {
                throw new MissingRequiredPropertyException("PolicyArgs", "permissions");
            }
            if ($.policyName == null) {
                throw new MissingRequiredPropertyException("PolicyArgs", "policyName");
            }
            if ($.resources == null) {
                throw new MissingRequiredPropertyException("PolicyArgs", "resources");
            }
            return $;
        }
    }

}
