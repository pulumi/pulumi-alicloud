// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.rocketmq.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetInstancesInstance {
    /**
     * @return The internal HTTP endpoint for the Message Queue for Apache RocketMQ instance.
     * 
     */
    private final String httpInternalEndpoint;
    /**
     * @return The public HTTP endpoint for the Message Queue for Apache RocketMQ instance.
     * 
     */
    private final String httpInternetEndpoint;
    /**
     * @return The public HTTPS endpoint for the Message Queue for Apache RocketMQ instance.
     * 
     */
    private final String httpInternetSecureEndpoint;
    /**
     * @return ID of the instance.
     * 
     */
    private final String id;
    /**
     * @return Indicates whether any namespace is configured for the Message Queue for Apache RocketMQ instance.
     * 
     */
    private final Boolean independentNaming;
    /**
     * @return ID of the instance.
     * 
     */
    private final String instanceId;
    /**
     * @return Name of the instance.
     * 
     */
    private final String instanceName;
    /**
     * @return The status of the instance. Read [Fields in InstanceVO](https://www.alibabacloud.com/help/doc-detail/106351.html) for further details.
     * 
     */
    private final Integer instanceStatus;
    /**
     * @return The type of the instance. Read [Fields in InstanceVO](https://www.alibabacloud.com/help/doc-detail/106351.html) for further details.
     * 
     */
    private final Integer instanceType;
    /**
     * @return The automatic release time of an Enterprise Platinum Edition instance.
     * 
     */
    private final String releaseTime;
    /**
     * @return This attribute is a concise description of instance.
     * 
     */
    private final String remark;
    /**
     * @return The status of Ons instance. Valid values: `0` deploying, `2` arrears, `5` running, `7` upgrading.
     * 
     */
    private final Integer status;
    /**
     * @return A map of tags assigned to the Ons instance.
     * 
     */
    private final Map<String,Object> tags;
    /**
     * @return The TCP endpoint for the Message Queue for Apache RocketMQ instance.
     * 
     */
    private final String tcpEndpoint;

    @CustomType.Constructor
    private GetInstancesInstance(
        @CustomType.Parameter("httpInternalEndpoint") String httpInternalEndpoint,
        @CustomType.Parameter("httpInternetEndpoint") String httpInternetEndpoint,
        @CustomType.Parameter("httpInternetSecureEndpoint") String httpInternetSecureEndpoint,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("independentNaming") Boolean independentNaming,
        @CustomType.Parameter("instanceId") String instanceId,
        @CustomType.Parameter("instanceName") String instanceName,
        @CustomType.Parameter("instanceStatus") Integer instanceStatus,
        @CustomType.Parameter("instanceType") Integer instanceType,
        @CustomType.Parameter("releaseTime") String releaseTime,
        @CustomType.Parameter("remark") String remark,
        @CustomType.Parameter("status") Integer status,
        @CustomType.Parameter("tags") Map<String,Object> tags,
        @CustomType.Parameter("tcpEndpoint") String tcpEndpoint) {
        this.httpInternalEndpoint = httpInternalEndpoint;
        this.httpInternetEndpoint = httpInternetEndpoint;
        this.httpInternetSecureEndpoint = httpInternetSecureEndpoint;
        this.id = id;
        this.independentNaming = independentNaming;
        this.instanceId = instanceId;
        this.instanceName = instanceName;
        this.instanceStatus = instanceStatus;
        this.instanceType = instanceType;
        this.releaseTime = releaseTime;
        this.remark = remark;
        this.status = status;
        this.tags = tags;
        this.tcpEndpoint = tcpEndpoint;
    }

    /**
     * @return The internal HTTP endpoint for the Message Queue for Apache RocketMQ instance.
     * 
     */
    public String httpInternalEndpoint() {
        return this.httpInternalEndpoint;
    }
    /**
     * @return The public HTTP endpoint for the Message Queue for Apache RocketMQ instance.
     * 
     */
    public String httpInternetEndpoint() {
        return this.httpInternetEndpoint;
    }
    /**
     * @return The public HTTPS endpoint for the Message Queue for Apache RocketMQ instance.
     * 
     */
    public String httpInternetSecureEndpoint() {
        return this.httpInternetSecureEndpoint;
    }
    /**
     * @return ID of the instance.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Indicates whether any namespace is configured for the Message Queue for Apache RocketMQ instance.
     * 
     */
    public Boolean independentNaming() {
        return this.independentNaming;
    }
    /**
     * @return ID of the instance.
     * 
     */
    public String instanceId() {
        return this.instanceId;
    }
    /**
     * @return Name of the instance.
     * 
     */
    public String instanceName() {
        return this.instanceName;
    }
    /**
     * @return The status of the instance. Read [Fields in InstanceVO](https://www.alibabacloud.com/help/doc-detail/106351.html) for further details.
     * 
     */
    public Integer instanceStatus() {
        return this.instanceStatus;
    }
    /**
     * @return The type of the instance. Read [Fields in InstanceVO](https://www.alibabacloud.com/help/doc-detail/106351.html) for further details.
     * 
     */
    public Integer instanceType() {
        return this.instanceType;
    }
    /**
     * @return The automatic release time of an Enterprise Platinum Edition instance.
     * 
     */
    public String releaseTime() {
        return this.releaseTime;
    }
    /**
     * @return This attribute is a concise description of instance.
     * 
     */
    public String remark() {
        return this.remark;
    }
    /**
     * @return The status of Ons instance. Valid values: `0` deploying, `2` arrears, `5` running, `7` upgrading.
     * 
     */
    public Integer status() {
        return this.status;
    }
    /**
     * @return A map of tags assigned to the Ons instance.
     * 
     */
    public Map<String,Object> tags() {
        return this.tags;
    }
    /**
     * @return The TCP endpoint for the Message Queue for Apache RocketMQ instance.
     * 
     */
    public String tcpEndpoint() {
        return this.tcpEndpoint;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstancesInstance defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String httpInternalEndpoint;
        private String httpInternetEndpoint;
        private String httpInternetSecureEndpoint;
        private String id;
        private Boolean independentNaming;
        private String instanceId;
        private String instanceName;
        private Integer instanceStatus;
        private Integer instanceType;
        private String releaseTime;
        private String remark;
        private Integer status;
        private Map<String,Object> tags;
        private String tcpEndpoint;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInstancesInstance defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.httpInternalEndpoint = defaults.httpInternalEndpoint;
    	      this.httpInternetEndpoint = defaults.httpInternetEndpoint;
    	      this.httpInternetSecureEndpoint = defaults.httpInternetSecureEndpoint;
    	      this.id = defaults.id;
    	      this.independentNaming = defaults.independentNaming;
    	      this.instanceId = defaults.instanceId;
    	      this.instanceName = defaults.instanceName;
    	      this.instanceStatus = defaults.instanceStatus;
    	      this.instanceType = defaults.instanceType;
    	      this.releaseTime = defaults.releaseTime;
    	      this.remark = defaults.remark;
    	      this.status = defaults.status;
    	      this.tags = defaults.tags;
    	      this.tcpEndpoint = defaults.tcpEndpoint;
        }

        public Builder httpInternalEndpoint(String httpInternalEndpoint) {
            this.httpInternalEndpoint = Objects.requireNonNull(httpInternalEndpoint);
            return this;
        }
        public Builder httpInternetEndpoint(String httpInternetEndpoint) {
            this.httpInternetEndpoint = Objects.requireNonNull(httpInternetEndpoint);
            return this;
        }
        public Builder httpInternetSecureEndpoint(String httpInternetSecureEndpoint) {
            this.httpInternetSecureEndpoint = Objects.requireNonNull(httpInternetSecureEndpoint);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder independentNaming(Boolean independentNaming) {
            this.independentNaming = Objects.requireNonNull(independentNaming);
            return this;
        }
        public Builder instanceId(String instanceId) {
            this.instanceId = Objects.requireNonNull(instanceId);
            return this;
        }
        public Builder instanceName(String instanceName) {
            this.instanceName = Objects.requireNonNull(instanceName);
            return this;
        }
        public Builder instanceStatus(Integer instanceStatus) {
            this.instanceStatus = Objects.requireNonNull(instanceStatus);
            return this;
        }
        public Builder instanceType(Integer instanceType) {
            this.instanceType = Objects.requireNonNull(instanceType);
            return this;
        }
        public Builder releaseTime(String releaseTime) {
            this.releaseTime = Objects.requireNonNull(releaseTime);
            return this;
        }
        public Builder remark(String remark) {
            this.remark = Objects.requireNonNull(remark);
            return this;
        }
        public Builder status(Integer status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public Builder tags(Map<String,Object> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public Builder tcpEndpoint(String tcpEndpoint) {
            this.tcpEndpoint = Objects.requireNonNull(tcpEndpoint);
            return this;
        }        public GetInstancesInstance build() {
            return new GetInstancesInstance(httpInternalEndpoint, httpInternetEndpoint, httpInternetSecureEndpoint, id, independentNaming, instanceId, instanceName, instanceStatus, instanceType, releaseTime, remark, status, tags, tcpEndpoint);
        }
    }
}