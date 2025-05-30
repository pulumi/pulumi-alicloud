// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cs.inputs;

import com.pulumi.alicloud.cs.inputs.ServerlessKubernetesOperationPolicyClusterAutoUpgradeArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServerlessKubernetesOperationPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServerlessKubernetesOperationPolicyArgs Empty = new ServerlessKubernetesOperationPolicyArgs();

    /**
     * Automatic cluster upgrade policy. See `cluster_auto_upgrade` below.
     * 
     */
    @Import(name="clusterAutoUpgrade")
    private @Nullable Output<ServerlessKubernetesOperationPolicyClusterAutoUpgradeArgs> clusterAutoUpgrade;

    /**
     * @return Automatic cluster upgrade policy. See `cluster_auto_upgrade` below.
     * 
     */
    public Optional<Output<ServerlessKubernetesOperationPolicyClusterAutoUpgradeArgs>> clusterAutoUpgrade() {
        return Optional.ofNullable(this.clusterAutoUpgrade);
    }

    private ServerlessKubernetesOperationPolicyArgs() {}

    private ServerlessKubernetesOperationPolicyArgs(ServerlessKubernetesOperationPolicyArgs $) {
        this.clusterAutoUpgrade = $.clusterAutoUpgrade;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServerlessKubernetesOperationPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServerlessKubernetesOperationPolicyArgs $;

        public Builder() {
            $ = new ServerlessKubernetesOperationPolicyArgs();
        }

        public Builder(ServerlessKubernetesOperationPolicyArgs defaults) {
            $ = new ServerlessKubernetesOperationPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clusterAutoUpgrade Automatic cluster upgrade policy. See `cluster_auto_upgrade` below.
         * 
         * @return builder
         * 
         */
        public Builder clusterAutoUpgrade(@Nullable Output<ServerlessKubernetesOperationPolicyClusterAutoUpgradeArgs> clusterAutoUpgrade) {
            $.clusterAutoUpgrade = clusterAutoUpgrade;
            return this;
        }

        /**
         * @param clusterAutoUpgrade Automatic cluster upgrade policy. See `cluster_auto_upgrade` below.
         * 
         * @return builder
         * 
         */
        public Builder clusterAutoUpgrade(ServerlessKubernetesOperationPolicyClusterAutoUpgradeArgs clusterAutoUpgrade) {
            return clusterAutoUpgrade(Output.of(clusterAutoUpgrade));
        }

        public ServerlessKubernetesOperationPolicyArgs build() {
            return $;
        }
    }

}
