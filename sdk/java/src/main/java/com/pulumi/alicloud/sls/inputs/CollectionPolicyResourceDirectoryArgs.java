// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.sls.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CollectionPolicyResourceDirectoryArgs extends com.pulumi.resources.ResourceArgs {

    public static final CollectionPolicyResourceDirectoryArgs Empty = new CollectionPolicyResourceDirectoryArgs();

    /**
     * Support all mode all and custom mode custom under this resource directory
     * 
     */
    @Import(name="accountGroupType")
    private @Nullable Output<String> accountGroupType;

    /**
     * @return Support all mode all and custom mode custom under this resource directory
     * 
     */
    public Optional<Output<String>> accountGroupType() {
        return Optional.ofNullable(this.accountGroupType);
    }

    /**
     * When the resource directory is configured in the custom mode, the corresponding member account list
     * 
     */
    @Import(name="members")
    private @Nullable Output<List<String>> members;

    /**
     * @return When the resource directory is configured in the custom mode, the corresponding member account list
     * 
     */
    public Optional<Output<List<String>>> members() {
        return Optional.ofNullable(this.members);
    }

    private CollectionPolicyResourceDirectoryArgs() {}

    private CollectionPolicyResourceDirectoryArgs(CollectionPolicyResourceDirectoryArgs $) {
        this.accountGroupType = $.accountGroupType;
        this.members = $.members;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CollectionPolicyResourceDirectoryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CollectionPolicyResourceDirectoryArgs $;

        public Builder() {
            $ = new CollectionPolicyResourceDirectoryArgs();
        }

        public Builder(CollectionPolicyResourceDirectoryArgs defaults) {
            $ = new CollectionPolicyResourceDirectoryArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountGroupType Support all mode all and custom mode custom under this resource directory
         * 
         * @return builder
         * 
         */
        public Builder accountGroupType(@Nullable Output<String> accountGroupType) {
            $.accountGroupType = accountGroupType;
            return this;
        }

        /**
         * @param accountGroupType Support all mode all and custom mode custom under this resource directory
         * 
         * @return builder
         * 
         */
        public Builder accountGroupType(String accountGroupType) {
            return accountGroupType(Output.of(accountGroupType));
        }

        /**
         * @param members When the resource directory is configured in the custom mode, the corresponding member account list
         * 
         * @return builder
         * 
         */
        public Builder members(@Nullable Output<List<String>> members) {
            $.members = members;
            return this;
        }

        /**
         * @param members When the resource directory is configured in the custom mode, the corresponding member account list
         * 
         * @return builder
         * 
         */
        public Builder members(List<String> members) {
            return members(Output.of(members));
        }

        /**
         * @param members When the resource directory is configured in the custom mode, the corresponding member account list
         * 
         * @return builder
         * 
         */
        public Builder members(String... members) {
            return members(List.of(members));
        }

        public CollectionPolicyResourceDirectoryArgs build() {
            return $;
        }
    }

}
