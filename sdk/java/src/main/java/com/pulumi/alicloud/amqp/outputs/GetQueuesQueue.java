// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.amqp.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetQueuesQueue {
    /**
     * @return The attributes for the Queue.
     * 
     */
    private final Map<String,Object> attributes;
    /**
     * @return Specifies whether the Auto Delete attribute is configured.
     * 
     */
    private final Boolean autoDeleteState;
    /**
     * @return CreateTime.
     * 
     */
    private final String createTime;
    /**
     * @return Specifies whether the queue is an exclusive queue.
     * 
     */
    private final Boolean exclusiveState;
    /**
     * @return The ID of the Queue. Its value is same as Queue Name.
     * 
     */
    private final String id;
    /**
     * @return The ID of the instance.
     * 
     */
    private final String instanceId;
    /**
     * @return The last consume time.
     * 
     */
    private final String lastConsumeTime;
    /**
     * @return The queue name.
     * 
     */
    private final String queueName;
    /**
     * @return The name of the virtual host.
     * 
     */
    private final String virtualHostName;

    @CustomType.Constructor
    private GetQueuesQueue(
        @CustomType.Parameter("attributes") Map<String,Object> attributes,
        @CustomType.Parameter("autoDeleteState") Boolean autoDeleteState,
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("exclusiveState") Boolean exclusiveState,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("instanceId") String instanceId,
        @CustomType.Parameter("lastConsumeTime") String lastConsumeTime,
        @CustomType.Parameter("queueName") String queueName,
        @CustomType.Parameter("virtualHostName") String virtualHostName) {
        this.attributes = attributes;
        this.autoDeleteState = autoDeleteState;
        this.createTime = createTime;
        this.exclusiveState = exclusiveState;
        this.id = id;
        this.instanceId = instanceId;
        this.lastConsumeTime = lastConsumeTime;
        this.queueName = queueName;
        this.virtualHostName = virtualHostName;
    }

    /**
     * @return The attributes for the Queue.
     * 
     */
    public Map<String,Object> attributes() {
        return this.attributes;
    }
    /**
     * @return Specifies whether the Auto Delete attribute is configured.
     * 
     */
    public Boolean autoDeleteState() {
        return this.autoDeleteState;
    }
    /**
     * @return CreateTime.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return Specifies whether the queue is an exclusive queue.
     * 
     */
    public Boolean exclusiveState() {
        return this.exclusiveState;
    }
    /**
     * @return The ID of the Queue. Its value is same as Queue Name.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The ID of the instance.
     * 
     */
    public String instanceId() {
        return this.instanceId;
    }
    /**
     * @return The last consume time.
     * 
     */
    public String lastConsumeTime() {
        return this.lastConsumeTime;
    }
    /**
     * @return The queue name.
     * 
     */
    public String queueName() {
        return this.queueName;
    }
    /**
     * @return The name of the virtual host.
     * 
     */
    public String virtualHostName() {
        return this.virtualHostName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetQueuesQueue defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,Object> attributes;
        private Boolean autoDeleteState;
        private String createTime;
        private Boolean exclusiveState;
        private String id;
        private String instanceId;
        private String lastConsumeTime;
        private String queueName;
        private String virtualHostName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetQueuesQueue defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attributes = defaults.attributes;
    	      this.autoDeleteState = defaults.autoDeleteState;
    	      this.createTime = defaults.createTime;
    	      this.exclusiveState = defaults.exclusiveState;
    	      this.id = defaults.id;
    	      this.instanceId = defaults.instanceId;
    	      this.lastConsumeTime = defaults.lastConsumeTime;
    	      this.queueName = defaults.queueName;
    	      this.virtualHostName = defaults.virtualHostName;
        }

        public Builder attributes(Map<String,Object> attributes) {
            this.attributes = Objects.requireNonNull(attributes);
            return this;
        }
        public Builder autoDeleteState(Boolean autoDeleteState) {
            this.autoDeleteState = Objects.requireNonNull(autoDeleteState);
            return this;
        }
        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        public Builder exclusiveState(Boolean exclusiveState) {
            this.exclusiveState = Objects.requireNonNull(exclusiveState);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder instanceId(String instanceId) {
            this.instanceId = Objects.requireNonNull(instanceId);
            return this;
        }
        public Builder lastConsumeTime(String lastConsumeTime) {
            this.lastConsumeTime = Objects.requireNonNull(lastConsumeTime);
            return this;
        }
        public Builder queueName(String queueName) {
            this.queueName = Objects.requireNonNull(queueName);
            return this;
        }
        public Builder virtualHostName(String virtualHostName) {
            this.virtualHostName = Objects.requireNonNull(virtualHostName);
            return this;
        }        public GetQueuesQueue build() {
            return new GetQueuesQueue(attributes, autoDeleteState, createTime, exclusiveState, id, instanceId, lastConsumeTime, queueName, virtualHostName);
        }
    }
}