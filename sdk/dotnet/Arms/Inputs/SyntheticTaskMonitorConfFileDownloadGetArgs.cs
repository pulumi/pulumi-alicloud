// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Arms.Inputs
{

    public sealed class SyntheticTaskMonitorConfFileDownloadGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("connectionTimeout")]
        public Input<int>? ConnectionTimeout { get; set; }

        [Input("customHeaderContent")]
        private InputMap<object>? _customHeaderContent;
        public InputMap<object> CustomHeaderContent
        {
            get => _customHeaderContent ?? (_customHeaderContent = new InputMap<object>());
            set => _customHeaderContent = value;
        }

        [Input("downloadKernel")]
        public Input<int>? DownloadKernel { get; set; }

        [Input("ignoreCertificateAuthError")]
        public Input<int>? IgnoreCertificateAuthError { get; set; }

        [Input("ignoreCertificateCanceledError")]
        public Input<int>? IgnoreCertificateCanceledError { get; set; }

        [Input("ignoreCertificateOutOfDateError")]
        public Input<int>? IgnoreCertificateOutOfDateError { get; set; }

        [Input("ignoreCertificateStatusError")]
        public Input<int>? IgnoreCertificateStatusError { get; set; }

        [Input("ignoreCertificateUntrustworthyError")]
        public Input<int>? IgnoreCertificateUntrustworthyError { get; set; }

        [Input("ignoreCertificateUsingError")]
        public Input<int>? IgnoreCertificateUsingError { get; set; }

        [Input("ignoreInvalidHostError")]
        public Input<int>? IgnoreInvalidHostError { get; set; }

        [Input("monitorTimeout")]
        public Input<int>? MonitorTimeout { get; set; }

        [Input("quickProtocol")]
        public Input<int>? QuickProtocol { get; set; }

        [Input("redirection")]
        public Input<int>? Redirection { get; set; }

        [Input("targetUrl", required: true)]
        public Input<string> TargetUrl { get; set; } = null!;

        [Input("transmissionSize")]
        public Input<int>? TransmissionSize { get; set; }

        [Input("validateKeywords")]
        public Input<string>? ValidateKeywords { get; set; }

        [Input("verifyWay")]
        public Input<int>? VerifyWay { get; set; }

        [Input("whiteList")]
        public Input<string>? WhiteList { get; set; }

        public SyntheticTaskMonitorConfFileDownloadGetArgs()
        {
        }
        public static new SyntheticTaskMonitorConfFileDownloadGetArgs Empty => new SyntheticTaskMonitorConfFileDownloadGetArgs();
    }
}