// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ess.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetLifecycleHooksHook {
    /**
     * @return Defines the action the Auto Scaling group should take when the lifecycle hook timeout elapses.
     * 
     */
    private final String defaultResult;
    /**
     * @return Defines the amount of time, in seconds, that can elapse before the lifecycle hook times out. When the lifecycle hook times out, Auto Scaling performs the action defined in the default_result parameter.
     * 
     */
    private final Integer heartbeatTimeout;
    /**
     * @return ID of the lifecycle hook.
     * 
     */
    private final String id;
    /**
     * @return Type of Scaling activity attached to lifecycle hook.
     * 
     */
    private final String lifecycleTransition;
    /**
     * @return Name of the lifecycle hook.
     * 
     */
    private final String name;
    /**
     * @return The Arn of notification target.
     * 
     */
    private final String notificationArn;
    /**
     * @return Additional information that you want to include when Auto Scaling sends a message to the notification target.
     * 
     */
    private final String notificationMetadata;
    /**
     * @return Scaling group id the lifecycle hooks belong to.
     * 
     */
    private final String scalingGroupId;

    @CustomType.Constructor
    private GetLifecycleHooksHook(
        @CustomType.Parameter("defaultResult") String defaultResult,
        @CustomType.Parameter("heartbeatTimeout") Integer heartbeatTimeout,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("lifecycleTransition") String lifecycleTransition,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("notificationArn") String notificationArn,
        @CustomType.Parameter("notificationMetadata") String notificationMetadata,
        @CustomType.Parameter("scalingGroupId") String scalingGroupId) {
        this.defaultResult = defaultResult;
        this.heartbeatTimeout = heartbeatTimeout;
        this.id = id;
        this.lifecycleTransition = lifecycleTransition;
        this.name = name;
        this.notificationArn = notificationArn;
        this.notificationMetadata = notificationMetadata;
        this.scalingGroupId = scalingGroupId;
    }

    /**
     * @return Defines the action the Auto Scaling group should take when the lifecycle hook timeout elapses.
     * 
     */
    public String defaultResult() {
        return this.defaultResult;
    }
    /**
     * @return Defines the amount of time, in seconds, that can elapse before the lifecycle hook times out. When the lifecycle hook times out, Auto Scaling performs the action defined in the default_result parameter.
     * 
     */
    public Integer heartbeatTimeout() {
        return this.heartbeatTimeout;
    }
    /**
     * @return ID of the lifecycle hook.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Type of Scaling activity attached to lifecycle hook.
     * 
     */
    public String lifecycleTransition() {
        return this.lifecycleTransition;
    }
    /**
     * @return Name of the lifecycle hook.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The Arn of notification target.
     * 
     */
    public String notificationArn() {
        return this.notificationArn;
    }
    /**
     * @return Additional information that you want to include when Auto Scaling sends a message to the notification target.
     * 
     */
    public String notificationMetadata() {
        return this.notificationMetadata;
    }
    /**
     * @return Scaling group id the lifecycle hooks belong to.
     * 
     */
    public String scalingGroupId() {
        return this.scalingGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLifecycleHooksHook defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String defaultResult;
        private Integer heartbeatTimeout;
        private String id;
        private String lifecycleTransition;
        private String name;
        private String notificationArn;
        private String notificationMetadata;
        private String scalingGroupId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLifecycleHooksHook defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultResult = defaults.defaultResult;
    	      this.heartbeatTimeout = defaults.heartbeatTimeout;
    	      this.id = defaults.id;
    	      this.lifecycleTransition = defaults.lifecycleTransition;
    	      this.name = defaults.name;
    	      this.notificationArn = defaults.notificationArn;
    	      this.notificationMetadata = defaults.notificationMetadata;
    	      this.scalingGroupId = defaults.scalingGroupId;
        }

        public Builder defaultResult(String defaultResult) {
            this.defaultResult = Objects.requireNonNull(defaultResult);
            return this;
        }
        public Builder heartbeatTimeout(Integer heartbeatTimeout) {
            this.heartbeatTimeout = Objects.requireNonNull(heartbeatTimeout);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder lifecycleTransition(String lifecycleTransition) {
            this.lifecycleTransition = Objects.requireNonNull(lifecycleTransition);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder notificationArn(String notificationArn) {
            this.notificationArn = Objects.requireNonNull(notificationArn);
            return this;
        }
        public Builder notificationMetadata(String notificationMetadata) {
            this.notificationMetadata = Objects.requireNonNull(notificationMetadata);
            return this;
        }
        public Builder scalingGroupId(String scalingGroupId) {
            this.scalingGroupId = Objects.requireNonNull(scalingGroupId);
            return this;
        }        public GetLifecycleHooksHook build() {
            return new GetLifecycleHooksHook(defaultResult, heartbeatTimeout, id, lifecycleTransition, name, notificationArn, notificationMetadata, scalingGroupId);
        }
    }
}