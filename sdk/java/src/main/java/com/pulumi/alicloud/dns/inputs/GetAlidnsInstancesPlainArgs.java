// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.dns.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAlidnsInstancesPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAlidnsInstancesPlainArgs Empty = new GetAlidnsInstancesPlainArgs();

    /**
     * The type of domain.
     * 
     */
    @Import(name="domainType")
    private @Nullable String domainType;

    /**
     * @return The type of domain.
     * 
     */
    public Optional<String> domainType() {
        return Optional.ofNullable(this.domainType);
    }

    /**
     * A list of instance IDs.
     * 
     */
    @Import(name="ids")
    private @Nullable List<String> ids;

    /**
     * @return A list of instance IDs.
     * 
     */
    public Optional<List<String>> ids() {
        return Optional.ofNullable(this.ids);
    }

    /**
     * Language.
     * 
     */
    @Import(name="lang")
    private @Nullable String lang;

    /**
     * @return Language.
     * 
     */
    public Optional<String> lang() {
        return Optional.ofNullable(this.lang);
    }

    /**
     * File name where to save data source results (after running `pulumi preview`).
     * 
     */
    @Import(name="outputFile")
    private @Nullable String outputFile;

    /**
     * @return File name where to save data source results (after running `pulumi preview`).
     * 
     */
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }

    /**
     * The IP address of the client.
     * 
     */
    @Import(name="userClientIp")
    private @Nullable String userClientIp;

    /**
     * @return The IP address of the client.
     * 
     */
    public Optional<String> userClientIp() {
        return Optional.ofNullable(this.userClientIp);
    }

    private GetAlidnsInstancesPlainArgs() {}

    private GetAlidnsInstancesPlainArgs(GetAlidnsInstancesPlainArgs $) {
        this.domainType = $.domainType;
        this.ids = $.ids;
        this.lang = $.lang;
        this.outputFile = $.outputFile;
        this.userClientIp = $.userClientIp;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAlidnsInstancesPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAlidnsInstancesPlainArgs $;

        public Builder() {
            $ = new GetAlidnsInstancesPlainArgs();
        }

        public Builder(GetAlidnsInstancesPlainArgs defaults) {
            $ = new GetAlidnsInstancesPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param domainType The type of domain.
         * 
         * @return builder
         * 
         */
        public Builder domainType(@Nullable String domainType) {
            $.domainType = domainType;
            return this;
        }

        /**
         * @param ids A list of instance IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable List<String> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of instance IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        /**
         * @param lang Language.
         * 
         * @return builder
         * 
         */
        public Builder lang(@Nullable String lang) {
            $.lang = lang;
            return this;
        }

        /**
         * @param outputFile File name where to save data source results (after running `pulumi preview`).
         * 
         * @return builder
         * 
         */
        public Builder outputFile(@Nullable String outputFile) {
            $.outputFile = outputFile;
            return this;
        }

        /**
         * @param userClientIp The IP address of the client.
         * 
         * @return builder
         * 
         */
        public Builder userClientIp(@Nullable String userClientIp) {
            $.userClientIp = userClientIp;
            return this;
        }

        public GetAlidnsInstancesPlainArgs build() {
            return $;
        }
    }

}