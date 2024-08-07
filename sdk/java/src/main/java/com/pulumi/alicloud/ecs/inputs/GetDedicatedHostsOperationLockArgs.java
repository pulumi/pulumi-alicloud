// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ecs.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDedicatedHostsOperationLockArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetDedicatedHostsOperationLockArgs Empty = new GetDedicatedHostsOperationLockArgs();

    /**
     * The reason why the dedicated host resource is locked.
     * 
     */
    @Import(name="lockReason")
    private @Nullable Output<String> lockReason;

    /**
     * @return The reason why the dedicated host resource is locked.
     * 
     */
    public Optional<Output<String>> lockReason() {
        return Optional.ofNullable(this.lockReason);
    }

    private GetDedicatedHostsOperationLockArgs() {}

    private GetDedicatedHostsOperationLockArgs(GetDedicatedHostsOperationLockArgs $) {
        this.lockReason = $.lockReason;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDedicatedHostsOperationLockArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDedicatedHostsOperationLockArgs $;

        public Builder() {
            $ = new GetDedicatedHostsOperationLockArgs();
        }

        public Builder(GetDedicatedHostsOperationLockArgs defaults) {
            $ = new GetDedicatedHostsOperationLockArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param lockReason The reason why the dedicated host resource is locked.
         * 
         * @return builder
         * 
         */
        public Builder lockReason(@Nullable Output<String> lockReason) {
            $.lockReason = lockReason;
            return this;
        }

        /**
         * @param lockReason The reason why the dedicated host resource is locked.
         * 
         * @return builder
         * 
         */
        public Builder lockReason(String lockReason) {
            return lockReason(Output.of(lockReason));
        }

        public GetDedicatedHostsOperationLockArgs build() {
            return $;
        }
    }

}
