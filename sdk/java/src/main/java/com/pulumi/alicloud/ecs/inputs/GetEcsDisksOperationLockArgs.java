// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ecs.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetEcsDisksOperationLockArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetEcsDisksOperationLockArgs Empty = new GetEcsDisksOperationLockArgs();

    @Import(name="lockReason")
    private @Nullable Output<String> lockReason;

    public Optional<Output<String>> lockReason() {
        return Optional.ofNullable(this.lockReason);
    }

    private GetEcsDisksOperationLockArgs() {}

    private GetEcsDisksOperationLockArgs(GetEcsDisksOperationLockArgs $) {
        this.lockReason = $.lockReason;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetEcsDisksOperationLockArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetEcsDisksOperationLockArgs $;

        public Builder() {
            $ = new GetEcsDisksOperationLockArgs();
        }

        public Builder(GetEcsDisksOperationLockArgs defaults) {
            $ = new GetEcsDisksOperationLockArgs(Objects.requireNonNull(defaults));
        }

        public Builder lockReason(@Nullable Output<String> lockReason) {
            $.lockReason = lockReason;
            return this;
        }

        public Builder lockReason(String lockReason) {
            return lockReason(Output.of(lockReason));
        }

        public GetEcsDisksOperationLockArgs build() {
            return $;
        }
    }

}