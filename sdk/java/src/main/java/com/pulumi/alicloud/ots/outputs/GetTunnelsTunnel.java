// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ots.outputs;

import com.pulumi.alicloud.ots.outputs.GetTunnelsTunnelChannel;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetTunnelsTunnel {
    /**
     * @return The channels of OTS tunnel. Each element contains the following attributes:
     * 
     */
    private final List<GetTunnelsTunnelChannel> channels;
    /**
     * @return The creation time of the Tunnel.
     * 
     */
    private final Integer createTime;
    /**
     * @return Whether the tunnel has expired.
     * 
     */
    private final Boolean expired;
    /**
     * @return The resource ID. The value is `&lt;instance_name&gt;:&lt;table_name&gt;:&lt;tunnel_name&gt;`.
     * 
     */
    private final String id;
    /**
     * @return The name of OTS instance.
     * 
     */
    private final String instanceName;
    /**
     * @return The name of OTS table.
     * 
     */
    private final String tableName;
    /**
     * @return The tunnel id of the OTS which could not be changed.
     * 
     */
    private final String tunnelId;
    /**
     * @return The tunnel name of the OTS which could not be changed.
     * 
     */
    private final String tunnelName;
    /**
     * @return The latest consumption time of the tunnel, unix time in nanosecond.
     * 
     */
    private final Integer tunnelRpo;
    /**
     * @return The stage of OTS tunnel, valid values: `InitBaseDataAndStreamShard`, `ProcessBaseData`, `ProcessStream`.
     * 
     */
    private final String tunnelStage;
    /**
     * @return The type of the OTS tunnel, valid values: `BaseAndStream`, `BaseData`, `Stream`.
     * 
     */
    private final String tunnelType;

    @CustomType.Constructor
    private GetTunnelsTunnel(
        @CustomType.Parameter("channels") List<GetTunnelsTunnelChannel> channels,
        @CustomType.Parameter("createTime") Integer createTime,
        @CustomType.Parameter("expired") Boolean expired,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("instanceName") String instanceName,
        @CustomType.Parameter("tableName") String tableName,
        @CustomType.Parameter("tunnelId") String tunnelId,
        @CustomType.Parameter("tunnelName") String tunnelName,
        @CustomType.Parameter("tunnelRpo") Integer tunnelRpo,
        @CustomType.Parameter("tunnelStage") String tunnelStage,
        @CustomType.Parameter("tunnelType") String tunnelType) {
        this.channels = channels;
        this.createTime = createTime;
        this.expired = expired;
        this.id = id;
        this.instanceName = instanceName;
        this.tableName = tableName;
        this.tunnelId = tunnelId;
        this.tunnelName = tunnelName;
        this.tunnelRpo = tunnelRpo;
        this.tunnelStage = tunnelStage;
        this.tunnelType = tunnelType;
    }

    /**
     * @return The channels of OTS tunnel. Each element contains the following attributes:
     * 
     */
    public List<GetTunnelsTunnelChannel> channels() {
        return this.channels;
    }
    /**
     * @return The creation time of the Tunnel.
     * 
     */
    public Integer createTime() {
        return this.createTime;
    }
    /**
     * @return Whether the tunnel has expired.
     * 
     */
    public Boolean expired() {
        return this.expired;
    }
    /**
     * @return The resource ID. The value is `&lt;instance_name&gt;:&lt;table_name&gt;:&lt;tunnel_name&gt;`.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The name of OTS instance.
     * 
     */
    public String instanceName() {
        return this.instanceName;
    }
    /**
     * @return The name of OTS table.
     * 
     */
    public String tableName() {
        return this.tableName;
    }
    /**
     * @return The tunnel id of the OTS which could not be changed.
     * 
     */
    public String tunnelId() {
        return this.tunnelId;
    }
    /**
     * @return The tunnel name of the OTS which could not be changed.
     * 
     */
    public String tunnelName() {
        return this.tunnelName;
    }
    /**
     * @return The latest consumption time of the tunnel, unix time in nanosecond.
     * 
     */
    public Integer tunnelRpo() {
        return this.tunnelRpo;
    }
    /**
     * @return The stage of OTS tunnel, valid values: `InitBaseDataAndStreamShard`, `ProcessBaseData`, `ProcessStream`.
     * 
     */
    public String tunnelStage() {
        return this.tunnelStage;
    }
    /**
     * @return The type of the OTS tunnel, valid values: `BaseAndStream`, `BaseData`, `Stream`.
     * 
     */
    public String tunnelType() {
        return this.tunnelType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTunnelsTunnel defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetTunnelsTunnelChannel> channels;
        private Integer createTime;
        private Boolean expired;
        private String id;
        private String instanceName;
        private String tableName;
        private String tunnelId;
        private String tunnelName;
        private Integer tunnelRpo;
        private String tunnelStage;
        private String tunnelType;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTunnelsTunnel defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.channels = defaults.channels;
    	      this.createTime = defaults.createTime;
    	      this.expired = defaults.expired;
    	      this.id = defaults.id;
    	      this.instanceName = defaults.instanceName;
    	      this.tableName = defaults.tableName;
    	      this.tunnelId = defaults.tunnelId;
    	      this.tunnelName = defaults.tunnelName;
    	      this.tunnelRpo = defaults.tunnelRpo;
    	      this.tunnelStage = defaults.tunnelStage;
    	      this.tunnelType = defaults.tunnelType;
        }

        public Builder channels(List<GetTunnelsTunnelChannel> channels) {
            this.channels = Objects.requireNonNull(channels);
            return this;
        }
        public Builder channels(GetTunnelsTunnelChannel... channels) {
            return channels(List.of(channels));
        }
        public Builder createTime(Integer createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        public Builder expired(Boolean expired) {
            this.expired = Objects.requireNonNull(expired);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder instanceName(String instanceName) {
            this.instanceName = Objects.requireNonNull(instanceName);
            return this;
        }
        public Builder tableName(String tableName) {
            this.tableName = Objects.requireNonNull(tableName);
            return this;
        }
        public Builder tunnelId(String tunnelId) {
            this.tunnelId = Objects.requireNonNull(tunnelId);
            return this;
        }
        public Builder tunnelName(String tunnelName) {
            this.tunnelName = Objects.requireNonNull(tunnelName);
            return this;
        }
        public Builder tunnelRpo(Integer tunnelRpo) {
            this.tunnelRpo = Objects.requireNonNull(tunnelRpo);
            return this;
        }
        public Builder tunnelStage(String tunnelStage) {
            this.tunnelStage = Objects.requireNonNull(tunnelStage);
            return this;
        }
        public Builder tunnelType(String tunnelType) {
            this.tunnelType = Objects.requireNonNull(tunnelType);
            return this;
        }        public GetTunnelsTunnel build() {
            return new GetTunnelsTunnel(channels, createTime, expired, id, instanceName, tableName, tunnelId, tunnelName, tunnelRpo, tunnelStage, tunnelType);
        }
    }
}