package com.epam.creator.template;

/**
 * Helper class for creating mappings for different formats.
 * <p/>
 * Copyright (C) 2012 copyright.com
 * <p/>
 * Date: 4/20/12
 *
 * @author Siarhei Sabetski
 */
public final class MappingHelper {

    /**
     * String type for WorkItemTemplate.
     */
    private static final String STRING_TYPE = "String";

    /**
     * Number type for WorkItemTemplate.
     */
    private static final String NUMBER_TYPE = "Number";

    /**
     * Builds the work template for using in PubBooKParser.
     *
     * @return The work template.
     */
    public static IWorkTemplate buildPubBookTemplate() {
        IWorkTemplate workTemplate = buildBasePubTemplate();
        workTemplate.addWorkItemTemplate("work.isbn", "ISBN-10 or ISBN-13", STRING_TYPE, true);
        workTemplate.addWorkItemTemplate("work.workTitle.edition", "Edition Number", NUMBER_TYPE,
            false);
        workTemplate.addWorkItemTemplate("work.contributor.contributorName", "Contributor Name",
            STRING_TYPE, true);
        workTemplate.addWorkItemTemplate("work.contributor.contributorRole", "Contributor Type",
            STRING_TYPE, true);
        workTemplate.addWorkItemTemplate("work.contributor.contributorName", "Contributor1 Name",
            STRING_TYPE, false);
        workTemplate.addWorkItemTemplate("work.contributor.contributorRole", "Contributor1 Type",
            STRING_TYPE, false);
        workTemplate.addWorkItemTemplate("work.contributor.contributorName", "Contributor2 Name",
            STRING_TYPE, false);
        workTemplate.addWorkItemTemplate("work.contributor.contributorRole", "Contributor2 Type",
            STRING_TYPE, false);
        workTemplate.addWorkItemTemplate("work.extent.extentValueRaw", "Number of Pages",
            STRING_TYPE, false);
        workTemplate.addWorkItemTemplate("work.workDates.publicationYear", "Publication Year",
            NUMBER_TYPE, true);
        workTemplate.addWorkItemTemplate("work.workDates.copyrightYear", "Copyright Year",
            NUMBER_TYPE, true);
        workTemplate.addWorkItemTemplate("work.series.name", "Series Name", STRING_TYPE, false);
        workTemplate.addWorkItemTemplate("work.series.volume", "Series Number or Volume",
            STRING_TYPE, false);
        workTemplate.addWorkItemTemplate("work.series.issn", "Series ISSN", STRING_TYPE, false);
        return workTemplate;
    }

    /**
     * Builds the work template for using in PubSerialParser.
     *
     * @return The work template.
     */
    public static IWorkTemplate buildPubSerialTemplate() {
        IWorkTemplate workTemplate = buildBasePubTemplate();
        workTemplate.addWorkItemTemplate("work.series.issn", "ISSN", STRING_TYPE, true);
        workTemplate.addWorkItemTemplate("work.frequency", "Frequency", STRING_TYPE, false);
        workTemplate.addWorkItemTemplate("work.workType", "Work Type", STRING_TYPE, false);
        workTemplate.addWorkItemTemplate("work.workDates.pubStartDate", "Publication Start Date",
            STRING_TYPE, false);
        workTemplate.addWorkItemTemplate("work.workDates.pubEndDate", "Publication End Date",
            STRING_TYPE, false);
        return workTemplate;
    }

    /**
     * Builds the work template to be used in {@link MarcParser}.
     *
     * @return The work template.
     */
    public static IWorkTemplate buildMarcTemplate() {
        IWorkTemplate workTemplate = new WorkTemplate();
        workTemplate.addWorkItemTemplate("work.lccn", "010$a", STRING_TYPE, true);
        workTemplate.addWorkItemTemplate("work.isbn", "020$a", STRING_TYPE, true);
        workTemplate.addWorkItemTemplate("work.issn", "022$a", STRING_TYPE, true);
        workTemplate.addWorkItemTemplate("work.author.name", "100$a", STRING_TYPE, true);
        workTemplate.addWorkItemTemplate("work.workTitle.title", "245$a", STRING_TYPE, true);
        workTemplate.addWorkItemTemplate("work.workTitle.title", "246$a", STRING_TYPE, true);
        workTemplate.addWorkItemTemplate("work.workTitle.subtitle", "245$b", STRING_TYPE, false);
        workTemplate.addWorkItemTemplate("work.workTitle.edition", "250$a", STRING_TYPE, false);
        workTemplate.addWorkItemTemplate("work.contributor.contributorName", "700$a", STRING_TYPE,
            false);
        workTemplate.addWorkItemTemplate("work.contributor.contributorRole", "700$4", STRING_TYPE,
            false);
        workTemplate.addWorkItemTemplate("work.workLanguage.language", "041$a", STRING_TYPE, false);
        workTemplate.addWorkItemTemplate("work.workLanguage.role", "041$h", STRING_TYPE, false);
        workTemplate.addWorkItemTemplate("work.publisher.name", "260$b", STRING_TYPE, true);
        workTemplate.addWorkItemTemplate("work.workDates.publicationYear", "260$c", NUMBER_TYPE,
            true);
        workTemplate
            .addWorkItemTemplate("work.workDates.copyrightYear", "264$c", STRING_TYPE, true);
        workTemplate.addWorkItemTemplate("work.publisher.placeOfPublication", "260$a", STRING_TYPE,
            true);
        workTemplate.addWorkItemTemplate("work.workSubject.subject", "650$a", STRING_TYPE, false);
        workTemplate.addWorkItemTemplate("work.publicationCountry", "044$a", STRING_TYPE, true);

        return workTemplate;
    }

    /**
     * Builds the base work template for using in Pub* parsers.
     *
     * @return The work template.
     */
    private static IWorkTemplate buildBasePubTemplate() {
        IWorkTemplate workTemplate = new WorkTemplate();
        workTemplate.addWorkItemTemplate("work.workAbstract.abstractCopyrightOwner",
            "Rightsholder Accounting Identifier", STRING_TYPE, false);
        workTemplate.addWorkItemTemplate("work.electronic", "Electronic?", "Boolean", false);
        workTemplate.addWorkItemTemplate("work.workTitle.prefix", "Title Prefix", STRING_TYPE,
            false);
        workTemplate.addWorkItemTemplate("work.workTitle.title", "Title", STRING_TYPE, true);
        workTemplate.addWorkItemTemplate("work.workTitle.title", "Main Title", STRING_TYPE, true);
        workTemplate.addWorkItemTemplate("work.workTitle.subTitle", "SubTitle", STRING_TYPE, false);
        workTemplate.addWorkItemTemplate("work.workLanguage.language", "Language", STRING_TYPE,
            false);
        workTemplate.addWorkItemTemplate("work.publisher.name", "Publisher (Imprint) Name",
            STRING_TYPE, true);
        workTemplate.addWorkItemTemplate("work.publisher.placeOfPublication",
            "Place of Publication", STRING_TYPE, true);
        workTemplate.addWorkItemTemplate("work.publicationCountry", "Country of Origin",
            STRING_TYPE, true);
        return workTemplate;
    }

    /**
     * Builds the onix template for using in Onix parsers.
     *
     * @return The work template.
     */
    // TODO: Resolve checkstyle warning on Windows 7 PC.
    public static IWorkTemplate buildOnixTemplate() {
        IWorkTemplate workTemplate = new WorkTemplate();
        workTemplate.addWorkItemTemplate("Product.RecordReference", "work.recordReference",
            STRING_TYPE, true);
        workTemplate.addWorkItemTemplate("Product.NotificationType", "work.notificationType",
            STRING_TYPE, false);
        workTemplate.addWorkItemTemplate("Product.ProductIdentifier.ProductIDType",
            "work.productIdentifier.productIDType", STRING_TYPE, true);
        workTemplate.addWorkItemTemplate("Product.ProductIdentifier.IDValue",
            "work.productIdentifier.idValue", NUMBER_TYPE, true);
        workTemplate.addWorkItemTemplate("Product.ProductForm", "work.productForm", STRING_TYPE,
            false);
        workTemplate.addWorkItemTemplate("Product.Title.TitleType", "work.title.titleType",
            STRING_TYPE, true);
        workTemplate.addWorkItemTemplate("Product.Title.TitleText", "work.title.titleText",
            STRING_TYPE, true);
        workTemplate.addWorkItemTemplate("Product.Title.Subtitle", "work.title.subtitle",
            STRING_TYPE, false);
        workTemplate.addWorkItemTemplate("Product.Contributor.SequenceNumber",
            "work.contributor.sequenceNumber", STRING_TYPE, true);
        workTemplate.addWorkItemTemplate("Product.Contributor.ContributorRole",
            "work.contributor.contributorRole", STRING_TYPE, false);
        workTemplate.addWorkItemTemplate("Product.Contributor.LanguageCode",
            "work.contributor.languageCode", STRING_TYPE, true);
        workTemplate.addWorkItemTemplate("Product.Contributor.PersonName",
            "work.contributor.personName", STRING_TYPE, false);
        workTemplate.addWorkItemTemplate("Product.Contributor.PersonNameInverted",
            "work.contributor.personNameInverted", STRING_TYPE, false);
        workTemplate.addWorkItemTemplate("Product.Contributor.NamesBeforeKey",
            "work.contributor.namesBeforeKey", STRING_TYPE, false);
        workTemplate.addWorkItemTemplate("Product.Contributor.KeyNames",
            "work.contributor.keyNames", STRING_TYPE, false);
        workTemplate.addWorkItemTemplate("Product.Contributor.BiographicalNote",
            "work.contributor.biographicalNote", STRING_TYPE, false);
        workTemplate.addWorkItemTemplate("Product.Measure.MeasureTypeCode",
            "work.measure.measureTypeCode", STRING_TYPE, true);
        workTemplate.addWorkItemTemplate("Product.Measure.Measurement", "work.measure.measurement",
            STRING_TYPE, true);
        workTemplate.addWorkItemTemplate("Product.Measure.MeasureUnitCode",
            "work.measure.measureUnitCode", STRING_TYPE, false);
        workTemplate.addWorkItemTemplate("Product.NumberOfPages", "work.numberOfPages",
            NUMBER_TYPE, true);
        workTemplate.addWorkItemTemplate("Product.BASICMainSubject", "work.basicMainSubject",
            NUMBER_TYPE, false);
        return workTemplate;
    }

    /**
     * Builds the custom onix template for using in Onix parsers. This template uses for creating
     * valid object for processing phase.
     *
     * @return The work template.
     */
    public static IWorkTemplate buildCustomOnixTemplate() {
        IWorkTemplate workTemplate = buildOnixTemplate();
        workTemplate.addWorkItemTemplate("Product.Title.TitleType", "work.workTitle.title",
            STRING_TYPE, true);
        workTemplate.addWorkItemTemplate("Product.Title.TitleText", "work.workTitle.typeCd",
            STRING_TYPE, true);
        workTemplate.addWorkItemTemplate("Product.PublicationCountry", "work.publicationCountry",
            STRING_TYPE, true);
        workTemplate.addWorkItemTemplate("Product.Publisher.PublisherName", "work.publisher.name",
            STRING_TYPE, true);
        workTemplate.addWorkItemTemplate("Product.Publisher.PublisherRole",
            "work.publisher.roleInst", STRING_TYPE, true);
        workTemplate.addWorkItemTemplate("Product.PublicationStartDate",
            "work.workDates.pubStartDate", STRING_TYPE, true);
        workTemplate.addWorkItemTemplate("Product.Item.StartPage", "work.itemAttributes.startPage",
            STRING_TYPE, true);
        workTemplate.addWorkItemTemplate("Product.Item.Volume", "work.itemAttributes.volume",
            STRING_TYPE, true);
        workTemplate.addWorkItemTemplate("Product.Item.PageRange", "work.itemAttributes.pageRange",
            STRING_TYPE, true);
        workTemplate.addWorkItemTemplate("Product.Item.Issue", "work.itemAttributes.issue",
            STRING_TYPE, true);
        workTemplate.addWorkItemTemplate("Product.IDNO.IDNO", "work.idno.idno",
            STRING_TYPE, true);
        workTemplate.addWorkItemTemplate("Product.IDNO.Type", "work.idno.typeCd",
            STRING_TYPE, true);
        workTemplate.addWorkItemTemplate("Product.SourcePrimaryKey", "work.sourcePrimaryKey",
            STRING_TYPE, true);
        workTemplate.addWorkItemTemplate("Product.SplitInst", "work.splitInst",
            STRING_TYPE, true);
        workTemplate.addWorkItemTemplate("Product.Contributor.PersonName", "work.normedContributor",
            STRING_TYPE, true);
        return workTemplate;
    }
}
