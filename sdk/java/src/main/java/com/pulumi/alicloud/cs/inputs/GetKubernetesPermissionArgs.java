// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cs.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetKubernetesPermissionArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetKubernetesPermissionArgs Empty = new GetKubernetesPermissionArgs();

    /**
     * The ID of the RAM user. If you want to query the permissions of a RAM role, specify the ID of the RAM role.
     * 
     */
    @Import(name="uid", required=true)
    private Output<String> uid;

    /**
     * @return The ID of the RAM user. If you want to query the permissions of a RAM role, specify the ID of the RAM role.
     * 
     */
    public Output<String> uid() {
        return this.uid;
    }

    private GetKubernetesPermissionArgs() {}

    private GetKubernetesPermissionArgs(GetKubernetesPermissionArgs $) {
        this.uid = $.uid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetKubernetesPermissionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetKubernetesPermissionArgs $;

        public Builder() {
            $ = new GetKubernetesPermissionArgs();
        }

        public Builder(GetKubernetesPermissionArgs defaults) {
            $ = new GetKubernetesPermissionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param uid The ID of the RAM user. If you want to query the permissions of a RAM role, specify the ID of the RAM role.
         * 
         * @return builder
         * 
         */
        public Builder uid(Output<String> uid) {
            $.uid = uid;
            return this;
        }

        /**
         * @param uid The ID of the RAM user. If you want to query the permissions of a RAM role, specify the ID of the RAM role.
         * 
         * @return builder
         * 
         */
        public Builder uid(String uid) {
            return uid(Output.of(uid));
        }

        public GetKubernetesPermissionArgs build() {
            if ($.uid == null) {
                throw new MissingRequiredPropertyException("GetKubernetesPermissionArgs", "uid");
            }
            return $;
        }
    }

}
