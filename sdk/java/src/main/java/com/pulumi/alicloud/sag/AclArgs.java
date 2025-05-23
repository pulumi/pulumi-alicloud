// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.sag;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AclArgs extends com.pulumi.resources.ResourceArgs {

    public static final AclArgs Empty = new AclArgs();

    /**
     * The name of the ACL instance. The name can contain 2 to 128 characters including a-z, A-Z, 0-9, periods, underlines, and hyphens. The name must start with an English letter, but cannot start with http:// or https://.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the ACL instance. The name can contain 2 to 128 characters including a-z, A-Z, 0-9, periods, underlines, and hyphens. The name must start with an English letter, but cannot start with http:// or https://.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private AclArgs() {}

    private AclArgs(AclArgs $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AclArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AclArgs $;

        public Builder() {
            $ = new AclArgs();
        }

        public Builder(AclArgs defaults) {
            $ = new AclArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the ACL instance. The name can contain 2 to 128 characters including a-z, A-Z, 0-9, periods, underlines, and hyphens. The name must start with an English letter, but cannot start with http:// or https://.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the ACL instance. The name can contain 2 to 128 characters including a-z, A-Z, 0-9, periods, underlines, and hyphens. The name must start with an English letter, but cannot start with http:// or https://.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public AclArgs build() {
            return $;
        }
    }

}
