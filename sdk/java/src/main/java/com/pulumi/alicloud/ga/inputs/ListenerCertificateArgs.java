// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ga.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ListenerCertificateArgs extends com.pulumi.resources.ResourceArgs {

    public static final ListenerCertificateArgs Empty = new ListenerCertificateArgs();

    /**
     * The id of the certificate.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return The id of the certificate.
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    private ListenerCertificateArgs() {}

    private ListenerCertificateArgs(ListenerCertificateArgs $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListenerCertificateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListenerCertificateArgs $;

        public Builder() {
            $ = new ListenerCertificateArgs();
        }

        public Builder(ListenerCertificateArgs defaults) {
            $ = new ListenerCertificateArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The id of the certificate.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The id of the certificate.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        public ListenerCertificateArgs build() {
            return $;
        }
    }

}