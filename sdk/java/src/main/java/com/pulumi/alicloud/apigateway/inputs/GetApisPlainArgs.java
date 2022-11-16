// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.apigateway.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetApisPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetApisPlainArgs Empty = new GetApisPlainArgs();

    /**
     * (It has been deprecated from version 1.52.2, and use field &#39;ids&#39; to replace.) ID of the specified API.
     * 
     * @deprecated
     * Field &#39;api_id&#39; has been deprecated from provider version 1.52.2. New field &#39;ids&#39; replaces it.
     * 
     */
    @Deprecated /* Field 'api_id' has been deprecated from provider version 1.52.2. New field 'ids' replaces it. */
    @Import(name="apiId")
    private @Nullable String apiId;

    /**
     * @return (It has been deprecated from version 1.52.2, and use field &#39;ids&#39; to replace.) ID of the specified API.
     * 
     * @deprecated
     * Field &#39;api_id&#39; has been deprecated from provider version 1.52.2. New field &#39;ids&#39; replaces it.
     * 
     */
    @Deprecated /* Field 'api_id' has been deprecated from provider version 1.52.2. New field 'ids' replaces it. */
    public Optional<String> apiId() {
        return Optional.ofNullable(this.apiId);
    }

    /**
     * ID of the specified group.
     * 
     */
    @Import(name="groupId")
    private @Nullable String groupId;

    /**
     * @return ID of the specified group.
     * 
     */
    public Optional<String> groupId() {
        return Optional.ofNullable(this.groupId);
    }

    /**
     * A list of api IDs.
     * 
     */
    @Import(name="ids")
    private @Nullable List<String> ids;

    /**
     * @return A list of api IDs.
     * 
     */
    public Optional<List<String>> ids() {
        return Optional.ofNullable(this.ids);
    }

    /**
     * A regex string to filter api gateway apis by name.
     * 
     */
    @Import(name="nameRegex")
    private @Nullable String nameRegex;

    /**
     * @return A regex string to filter api gateway apis by name.
     * 
     */
    public Optional<String> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }

    @Import(name="outputFile")
    private @Nullable String outputFile;

    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }

    private GetApisPlainArgs() {}

    private GetApisPlainArgs(GetApisPlainArgs $) {
        this.apiId = $.apiId;
        this.groupId = $.groupId;
        this.ids = $.ids;
        this.nameRegex = $.nameRegex;
        this.outputFile = $.outputFile;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetApisPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetApisPlainArgs $;

        public Builder() {
            $ = new GetApisPlainArgs();
        }

        public Builder(GetApisPlainArgs defaults) {
            $ = new GetApisPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param apiId (It has been deprecated from version 1.52.2, and use field &#39;ids&#39; to replace.) ID of the specified API.
         * 
         * @return builder
         * 
         * @deprecated
         * Field &#39;api_id&#39; has been deprecated from provider version 1.52.2. New field &#39;ids&#39; replaces it.
         * 
         */
        @Deprecated /* Field 'api_id' has been deprecated from provider version 1.52.2. New field 'ids' replaces it. */
        public Builder apiId(@Nullable String apiId) {
            $.apiId = apiId;
            return this;
        }

        /**
         * @param groupId ID of the specified group.
         * 
         * @return builder
         * 
         */
        public Builder groupId(@Nullable String groupId) {
            $.groupId = groupId;
            return this;
        }

        /**
         * @param ids A list of api IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable List<String> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of api IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        /**
         * @param nameRegex A regex string to filter api gateway apis by name.
         * 
         * @return builder
         * 
         */
        public Builder nameRegex(@Nullable String nameRegex) {
            $.nameRegex = nameRegex;
            return this;
        }

        public Builder outputFile(@Nullable String outputFile) {
            $.outputFile = outputFile;
            return this;
        }

        public GetApisPlainArgs build() {
            return $;
        }
    }

}