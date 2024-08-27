// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.aligreen.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BizTypeState extends com.pulumi.resources.ResourceArgs {

    public static final BizTypeState Empty = new BizTypeState();

    /**
     * The name of the existing business scenario that was imported from when the business scenario was created.
     * 
     */
    @Import(name="bizTypeImport")
    private @Nullable Output<String> bizTypeImport;

    /**
     * @return The name of the existing business scenario that was imported from when the business scenario was created.
     * 
     */
    public Optional<Output<String>> bizTypeImport() {
        return Optional.ofNullable(this.bizTypeImport);
    }

    /**
     * The name of the business scenario defined by the customer. It can contain no more than 32 characters in English, numbers, and underscores.
     * 
     */
    @Import(name="bizTypeName")
    private @Nullable Output<String> bizTypeName;

    /**
     * @return The name of the business scenario defined by the customer. It can contain no more than 32 characters in English, numbers, and underscores.
     * 
     */
    public Optional<Output<String>> bizTypeName() {
        return Optional.ofNullable(this.bizTypeName);
    }

    /**
     * Specifies whether to import the configuration of an industry template. Default value: false. Valid values: true: imports the configuration of an industry template. false: does not import the configuration of an industry template. If the value is true, you must specify the industryInfo parameter.
     * 
     */
    @Import(name="citeTemplate")
    private @Nullable Output<Boolean> citeTemplate;

    /**
     * @return Specifies whether to import the configuration of an industry template. Default value: false. Valid values: true: imports the configuration of an industry template. false: does not import the configuration of an industry template. If the value is true, you must specify the industryInfo parameter.
     * 
     */
    public Optional<Output<Boolean>> citeTemplate() {
        return Optional.ofNullable(this.citeTemplate);
    }

    /**
     * The description of the business scenario defined by the customer, which is a combination of Chinese and English, numbers, and underscores, and cannot exceed 32 characters.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the business scenario defined by the customer, which is a combination of Chinese and English, numbers, and underscores, and cannot exceed 32 characters.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The industry classification. Valid values: Social-Registration information-Profile picture Social-Registration information-Nickname Social-Registration information-Bio Social-Instant messaging-Chat Social-Instant messaging-Group chat Social-Instant messaging-Chat room Social-Forums&amp;Communities-Post Social-Forums&amp;Communities-Comment Social-Forums&amp;Communities-Tag Social-Forums&amp;Communities-Recommendation Multimedia-Registration information-Profile picture Multimedia-Registration information-Nickname Multimedia-Registration information-Bio Multimedia-Instant messaging-Chat Multimedia-Live streaming-Heading Multimedia-Live streaming-Cover Multimedia-Live streaming-Content Multimedia-Live streaming-Comment Multimedia-Online storage-Storage content Multimedia-Online storage-Shared content Gaming-Registration information-Nickname Gaming-Registration information-Profile picture Gaming-Registration information-Signature Gaming-Instant messaging-Chat Gaming-Instant messaging-Group chat Gaming-Instant messaging-Chat room Gaming-Forums&amp;Communities-Post Gaming-Forums&amp;Communities-Comment Gaming-Forums&amp;Communities-Tag Gaming-Forums&amp;Communities-Recommendation New retail-Goods-Heading New retail-Goods-Description Reading-Books-Title Reading-Books-Heading Reading-Books-Cover Reading-Books-Content Media-News content-News content Education-Registration information-Nickname Education-Registration information-Profile picture Education-Registration information-Bio Gaming-Instant messaging-Chat Gaming-Forums&amp;Communities-Post Education-Forums&amp;Communities-Comment Education-Forums&amp;Communities-Tag Education-Forums&amp;Communities-Recommendation Education-Customer service-Voice call Others
     * 
     */
    @Import(name="industryInfo")
    private @Nullable Output<String> industryInfo;

    /**
     * @return The industry classification. Valid values: Social-Registration information-Profile picture Social-Registration information-Nickname Social-Registration information-Bio Social-Instant messaging-Chat Social-Instant messaging-Group chat Social-Instant messaging-Chat room Social-Forums&amp;Communities-Post Social-Forums&amp;Communities-Comment Social-Forums&amp;Communities-Tag Social-Forums&amp;Communities-Recommendation Multimedia-Registration information-Profile picture Multimedia-Registration information-Nickname Multimedia-Registration information-Bio Multimedia-Instant messaging-Chat Multimedia-Live streaming-Heading Multimedia-Live streaming-Cover Multimedia-Live streaming-Content Multimedia-Live streaming-Comment Multimedia-Online storage-Storage content Multimedia-Online storage-Shared content Gaming-Registration information-Nickname Gaming-Registration information-Profile picture Gaming-Registration information-Signature Gaming-Instant messaging-Chat Gaming-Instant messaging-Group chat Gaming-Instant messaging-Chat room Gaming-Forums&amp;Communities-Post Gaming-Forums&amp;Communities-Comment Gaming-Forums&amp;Communities-Tag Gaming-Forums&amp;Communities-Recommendation New retail-Goods-Heading New retail-Goods-Description Reading-Books-Title Reading-Books-Heading Reading-Books-Cover Reading-Books-Content Media-News content-News content Education-Registration information-Nickname Education-Registration information-Profile picture Education-Registration information-Bio Gaming-Instant messaging-Chat Gaming-Forums&amp;Communities-Post Education-Forums&amp;Communities-Comment Education-Forums&amp;Communities-Tag Education-Forums&amp;Communities-Recommendation Education-Customer service-Voice call Others
     * 
     */
    public Optional<Output<String>> industryInfo() {
        return Optional.ofNullable(this.industryInfo);
    }

    private BizTypeState() {}

    private BizTypeState(BizTypeState $) {
        this.bizTypeImport = $.bizTypeImport;
        this.bizTypeName = $.bizTypeName;
        this.citeTemplate = $.citeTemplate;
        this.description = $.description;
        this.industryInfo = $.industryInfo;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BizTypeState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BizTypeState $;

        public Builder() {
            $ = new BizTypeState();
        }

        public Builder(BizTypeState defaults) {
            $ = new BizTypeState(Objects.requireNonNull(defaults));
        }

        /**
         * @param bizTypeImport The name of the existing business scenario that was imported from when the business scenario was created.
         * 
         * @return builder
         * 
         */
        public Builder bizTypeImport(@Nullable Output<String> bizTypeImport) {
            $.bizTypeImport = bizTypeImport;
            return this;
        }

        /**
         * @param bizTypeImport The name of the existing business scenario that was imported from when the business scenario was created.
         * 
         * @return builder
         * 
         */
        public Builder bizTypeImport(String bizTypeImport) {
            return bizTypeImport(Output.of(bizTypeImport));
        }

        /**
         * @param bizTypeName The name of the business scenario defined by the customer. It can contain no more than 32 characters in English, numbers, and underscores.
         * 
         * @return builder
         * 
         */
        public Builder bizTypeName(@Nullable Output<String> bizTypeName) {
            $.bizTypeName = bizTypeName;
            return this;
        }

        /**
         * @param bizTypeName The name of the business scenario defined by the customer. It can contain no more than 32 characters in English, numbers, and underscores.
         * 
         * @return builder
         * 
         */
        public Builder bizTypeName(String bizTypeName) {
            return bizTypeName(Output.of(bizTypeName));
        }

        /**
         * @param citeTemplate Specifies whether to import the configuration of an industry template. Default value: false. Valid values: true: imports the configuration of an industry template. false: does not import the configuration of an industry template. If the value is true, you must specify the industryInfo parameter.
         * 
         * @return builder
         * 
         */
        public Builder citeTemplate(@Nullable Output<Boolean> citeTemplate) {
            $.citeTemplate = citeTemplate;
            return this;
        }

        /**
         * @param citeTemplate Specifies whether to import the configuration of an industry template. Default value: false. Valid values: true: imports the configuration of an industry template. false: does not import the configuration of an industry template. If the value is true, you must specify the industryInfo parameter.
         * 
         * @return builder
         * 
         */
        public Builder citeTemplate(Boolean citeTemplate) {
            return citeTemplate(Output.of(citeTemplate));
        }

        /**
         * @param description The description of the business scenario defined by the customer, which is a combination of Chinese and English, numbers, and underscores, and cannot exceed 32 characters.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the business scenario defined by the customer, which is a combination of Chinese and English, numbers, and underscores, and cannot exceed 32 characters.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param industryInfo The industry classification. Valid values: Social-Registration information-Profile picture Social-Registration information-Nickname Social-Registration information-Bio Social-Instant messaging-Chat Social-Instant messaging-Group chat Social-Instant messaging-Chat room Social-Forums&amp;Communities-Post Social-Forums&amp;Communities-Comment Social-Forums&amp;Communities-Tag Social-Forums&amp;Communities-Recommendation Multimedia-Registration information-Profile picture Multimedia-Registration information-Nickname Multimedia-Registration information-Bio Multimedia-Instant messaging-Chat Multimedia-Live streaming-Heading Multimedia-Live streaming-Cover Multimedia-Live streaming-Content Multimedia-Live streaming-Comment Multimedia-Online storage-Storage content Multimedia-Online storage-Shared content Gaming-Registration information-Nickname Gaming-Registration information-Profile picture Gaming-Registration information-Signature Gaming-Instant messaging-Chat Gaming-Instant messaging-Group chat Gaming-Instant messaging-Chat room Gaming-Forums&amp;Communities-Post Gaming-Forums&amp;Communities-Comment Gaming-Forums&amp;Communities-Tag Gaming-Forums&amp;Communities-Recommendation New retail-Goods-Heading New retail-Goods-Description Reading-Books-Title Reading-Books-Heading Reading-Books-Cover Reading-Books-Content Media-News content-News content Education-Registration information-Nickname Education-Registration information-Profile picture Education-Registration information-Bio Gaming-Instant messaging-Chat Gaming-Forums&amp;Communities-Post Education-Forums&amp;Communities-Comment Education-Forums&amp;Communities-Tag Education-Forums&amp;Communities-Recommendation Education-Customer service-Voice call Others
         * 
         * @return builder
         * 
         */
        public Builder industryInfo(@Nullable Output<String> industryInfo) {
            $.industryInfo = industryInfo;
            return this;
        }

        /**
         * @param industryInfo The industry classification. Valid values: Social-Registration information-Profile picture Social-Registration information-Nickname Social-Registration information-Bio Social-Instant messaging-Chat Social-Instant messaging-Group chat Social-Instant messaging-Chat room Social-Forums&amp;Communities-Post Social-Forums&amp;Communities-Comment Social-Forums&amp;Communities-Tag Social-Forums&amp;Communities-Recommendation Multimedia-Registration information-Profile picture Multimedia-Registration information-Nickname Multimedia-Registration information-Bio Multimedia-Instant messaging-Chat Multimedia-Live streaming-Heading Multimedia-Live streaming-Cover Multimedia-Live streaming-Content Multimedia-Live streaming-Comment Multimedia-Online storage-Storage content Multimedia-Online storage-Shared content Gaming-Registration information-Nickname Gaming-Registration information-Profile picture Gaming-Registration information-Signature Gaming-Instant messaging-Chat Gaming-Instant messaging-Group chat Gaming-Instant messaging-Chat room Gaming-Forums&amp;Communities-Post Gaming-Forums&amp;Communities-Comment Gaming-Forums&amp;Communities-Tag Gaming-Forums&amp;Communities-Recommendation New retail-Goods-Heading New retail-Goods-Description Reading-Books-Title Reading-Books-Heading Reading-Books-Cover Reading-Books-Content Media-News content-News content Education-Registration information-Nickname Education-Registration information-Profile picture Education-Registration information-Bio Gaming-Instant messaging-Chat Gaming-Forums&amp;Communities-Post Education-Forums&amp;Communities-Comment Education-Forums&amp;Communities-Tag Education-Forums&amp;Communities-Recommendation Education-Customer service-Voice call Others
         * 
         * @return builder
         * 
         */
        public Builder industryInfo(String industryInfo) {
            return industryInfo(Output.of(industryInfo));
        }

        public BizTypeState build() {
            return $;
        }
    }

}