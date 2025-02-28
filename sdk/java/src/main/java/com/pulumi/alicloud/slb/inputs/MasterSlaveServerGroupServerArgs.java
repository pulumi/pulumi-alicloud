// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.slb.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MasterSlaveServerGroupServerArgs extends com.pulumi.resources.ResourceArgs {

    public static final MasterSlaveServerGroupServerArgs Empty = new MasterSlaveServerGroupServerArgs();

    @Import(name="isBackup")
    private @Nullable Output<Integer> isBackup;

    public Optional<Output<Integer>> isBackup() {
        return Optional.ofNullable(this.isBackup);
    }

    @Import(name="port", required=true)
    private Output<Integer> port;

    public Output<Integer> port() {
        return this.port;
    }

    @Import(name="serverId", required=true)
    private Output<String> serverId;

    public Output<String> serverId() {
        return this.serverId;
    }

    @Import(name="serverType")
    private @Nullable Output<String> serverType;

    public Optional<Output<String>> serverType() {
        return Optional.ofNullable(this.serverType);
    }

    @Import(name="type")
    private @Nullable Output<String> type;

    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    @Import(name="weight")
    private @Nullable Output<Integer> weight;

    public Optional<Output<Integer>> weight() {
        return Optional.ofNullable(this.weight);
    }

    private MasterSlaveServerGroupServerArgs() {}

    private MasterSlaveServerGroupServerArgs(MasterSlaveServerGroupServerArgs $) {
        this.isBackup = $.isBackup;
        this.port = $.port;
        this.serverId = $.serverId;
        this.serverType = $.serverType;
        this.type = $.type;
        this.weight = $.weight;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MasterSlaveServerGroupServerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MasterSlaveServerGroupServerArgs $;

        public Builder() {
            $ = new MasterSlaveServerGroupServerArgs();
        }

        public Builder(MasterSlaveServerGroupServerArgs defaults) {
            $ = new MasterSlaveServerGroupServerArgs(Objects.requireNonNull(defaults));
        }

        public Builder isBackup(@Nullable Output<Integer> isBackup) {
            $.isBackup = isBackup;
            return this;
        }

        public Builder isBackup(Integer isBackup) {
            return isBackup(Output.of(isBackup));
        }

        public Builder port(Output<Integer> port) {
            $.port = port;
            return this;
        }

        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        public Builder serverId(Output<String> serverId) {
            $.serverId = serverId;
            return this;
        }

        public Builder serverId(String serverId) {
            return serverId(Output.of(serverId));
        }

        public Builder serverType(@Nullable Output<String> serverType) {
            $.serverType = serverType;
            return this;
        }

        public Builder serverType(String serverType) {
            return serverType(Output.of(serverType));
        }

        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public Builder weight(@Nullable Output<Integer> weight) {
            $.weight = weight;
            return this;
        }

        public Builder weight(Integer weight) {
            return weight(Output.of(weight));
        }

        public MasterSlaveServerGroupServerArgs build() {
            if ($.port == null) {
                throw new MissingRequiredPropertyException("MasterSlaveServerGroupServerArgs", "port");
            }
            if ($.serverId == null) {
                throw new MissingRequiredPropertyException("MasterSlaveServerGroupServerArgs", "serverId");
            }
            return $;
        }
    }

}
